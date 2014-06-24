package com.bj.habit.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bj.habit.domain.vo.reponse.ResponseData;
import com.bj.habit.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController extends BaseController{

	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/produce/{start}/{end}")
	public @ResponseBody ResponseData produceAccount(@PathVariable String start, @PathVariable String end){
		
		log.info("------start:"+start+",end:"+end);
		
		int startInt = Integer.parseInt(start);
		int endInt = Integer.parseInt(end);
		
		accountService.produceAccount(startInt, endInt);
		
		return getOkResponseData();
	}
}
