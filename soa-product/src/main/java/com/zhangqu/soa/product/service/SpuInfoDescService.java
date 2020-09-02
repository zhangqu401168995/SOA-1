package com.zhangqu.soa.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangqu.common.utils.PageUtils;
import com.zhangqu.soa.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu
 *
 * @author zhangqu
 * @email 401168995@qq.com
 * @date 2020-09-01 15:08:29
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

