package com.bj.habit.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bj.habit.dao.AccountDao;

@Component
public class AccountDaoImpl implements AccountDao {


	@Autowired
	private SqlSession sqlSession;
	
	public void add(String userId) {
		sqlSession.insert("account.insertOneUserId", userId);
	}

	public void addBach(List<String> ids) {
		
	}

}
