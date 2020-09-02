package com.zhangqu.soa.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangqu.common.utils.PageUtils;
import com.zhangqu.soa.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu
 *
 * @author zhangqu
 * @email 401168995@qq.com
 * @date 2020-09-01 15:08:30
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

