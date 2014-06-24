package com.bj.habit.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bj.habit.dao.AccountDao;
import com.bj.habit.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	private Logger log = Logger.getLogger(getClass());
	
	@Autowired
	private AccountDao accountDao;
	
	public void produceAccount(int start, int end) {
		for(int i=start ; i<end ;i++){
			String userId = String.valueOf(i);
			log.info("---保存账号ID："+userId);
			accountDao.add(userId);
		}
	}

	
}
