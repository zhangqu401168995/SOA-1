package com.zhangqu.soa.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhangqu
 * @email 401168995@qq.com
 * @date 2020-09-01 15:08:30
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long catId;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private Long parentCid;
	/**
	 * $column.comments
	 */
	private Integer catLevel;
	/**
	 * $column.comments
	 */
	private Integer showStatus;
	/**
	 * $column.comments
	 */
	private Integer sort;
	/**
	 * $column.comments
	 */
	private String icon;
	/**
	 * $column.comments
	 */
	private String productUnit;
	/**
	 * $column.comments
	 */
	private Integer productCount;

}
