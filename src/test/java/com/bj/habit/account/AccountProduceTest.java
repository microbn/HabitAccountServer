package com.bj.habit.account;

public class AccountProduceTest {

	public int[] buf = {0,1,2,3,4,5,6,7,8,9};
	private int canUse = 10;
	
	public void produce(){
		int total = 8;//共8位
		int index = 8;//从第8位开始
		for(;index>0;index--){
			
		}
			
	}
	public void doProduce(int total ,int index,String current){
		
	}
	
	public int getAndRemove(){
		if(canUse<=0){
			return -1;
		}
		int dest = buf[--canUse];
		return dest;
	}
	public void resetCanUse(){
		this.canUse = 10;
	}
}
