package com.xxxx.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共返回对象
 * 乐字节：专注线上IT培训
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {

	private long code;
	private String message;
	private Object obj;

	/**
	 * 功能描述: 成功返回结果
	 */
	public static com.xxxx.seckill.vo.RespBean success(){
		return new com.xxxx.seckill.vo.RespBean(RespBeanEnum.SUCCESS.getCode(),RespBeanEnum.SUCCESS.getMessage(),null);
	}

	/**
	 * 功能描述: 成功返回结果
	 */
	public static com.xxxx.seckill.vo.RespBean success(Object obj){
		return new com.xxxx.seckill.vo.RespBean(RespBeanEnum.SUCCESS.getCode(), RespBean.success().getMessage(),obj);
	}


	/**
	 * 功能描述: 失败返回结果
	 */
	public static com.xxxx.seckill.vo.RespBean error(RespBeanEnum respBeanEnum){
		return new com.xxxx.seckill.vo.RespBean(respBeanEnum.getCode(),respBeanEnum.getMessage(),null);
	}


	/**
	 * 功能描述: 失败返回结果
	 */
	public static com.xxxx.seckill.vo.RespBean error(RespBeanEnum respBeanEnum, Object obj){
		return new com.xxxx.seckill.vo.RespBean(respBeanEnum.getCode(),respBeanEnum.getMessage(),obj);
	}

}