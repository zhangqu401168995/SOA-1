package com.zhangqu.soa.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhangqu
 * @email 401168995@qq.com
 * @date 2020-09-02 13:58:54
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SmsSeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long promotionId;
	/**
	 * $column.comments
	 */
	private Long promotionSessionId;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private BigDecimal seckillPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal seckillCount;
	/**
	 * $column.comments
	 */
	private BigDecimal seckillLimit;
	/**
	 * $column.comments
	 */
	private Integer seckillSort;

}
