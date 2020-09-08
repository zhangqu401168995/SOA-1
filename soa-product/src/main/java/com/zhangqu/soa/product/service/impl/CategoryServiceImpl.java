package com.zhangqu.soa.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangqu.common.utils.PageUtils;
import com.zhangqu.common.utils.Query;
import com.zhangqu.soa.product.dao.CategoryDao;
import com.zhangqu.soa.product.entity.CategoryEntity;
import com.zhangqu.soa.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 将数据查出并组装成树形结构
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntityList =categoryDao.selectList(null);
        List<CategoryEntity> menu1 = categoryEntityList.stream().filter((categoryEntity)->{
            return categoryEntity.getParentCid() == 0;
        }).map((categoryEntity)->{
            categoryEntity.setMenu2(getChildren(categoryEntity,categoryEntityList));
            return categoryEntity;
        }).collect(Collectors.toList());





        return  menu1;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
       List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().equals(root.getCatId());

        }).map(categoryEntity -> {
            categoryEntity.setMenu2(getChildren(categoryEntity, all));
            return categoryEntity;
       }).collect(Collectors.toList());
        return children;
    }


}