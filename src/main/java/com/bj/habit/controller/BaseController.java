package com.bj.habit.controller;

import com.bj.habit.domain.vo.reponse.ResponseData;

/**
 * 实现公共的控制方法，controller中实现解码，转发，返回数据操作
 * service实现每个操作的业务逻辑
 * dao封装对数据库和缓存的访问
 * @author zhangbin
 *
 */
public abstract class BaseController {

	
	protected ResponseData getOkResponseData(){
		ResponseData response = new ResponseData();
		response.setType("200");
		response.setMessage("ok!");
		return response;
	}
}
