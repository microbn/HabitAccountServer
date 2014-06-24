package com.bj.habit.domain.vo.reponse;

import java.util.ArrayList;
import java.util.List;


public class ResponseData {

	private Meta meta ;  //元数据信息

	private List<BaseData> data;  //返回的数据

	public ResponseData(){
		data = new ArrayList<BaseData>();
		meta = new Meta();
	}
	
	public Meta getMeta() {
		return meta;
	}

	public void setType(String type){
		this.meta.setType(type);
	}
	public void setMessage(String message){
		this.meta.setMessage(message);
	}
	
	public List<BaseData> getData() {
		return data;
	}

	public void addData(BaseData data){
		this.data.add(data);
	}
	
}
