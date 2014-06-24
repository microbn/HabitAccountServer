package com.bj.habit.dao;

import java.util.List;

public interface AccountDao {

	public void add(String userId);//添加一个用户id
	
	public void addBach(List<String> ids); //批量添加用户id
}
