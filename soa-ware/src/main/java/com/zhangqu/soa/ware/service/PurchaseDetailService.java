package com.zhangqu.soa.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangqu.common.utils.PageUtils;
import com.zhangqu.soa.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhangqu
 * @email 401168995@qq.com
 * @date 2020-09-02 15:04:51
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

