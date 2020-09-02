package com.zhangqu.soa.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangqu.common.utils.PageUtils;
import com.zhangqu.soa.coupon.entity.SmsCouponSpuRelationEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhangqu
 * @email 401168995@qq.com
 * @date 2020-09-02 13:58:54
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

