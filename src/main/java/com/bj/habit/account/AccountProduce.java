package com.bj.habit.account;


/**
 * 账号生成器
 * @author binzhang205916
 */
public class AccountProduce {

	public static void main(String[] args) {
			doPorduce(8, 0, "11111111");
	}
	/**
	 * 
	 * @param index 当前的位数
	 * @param current 当前位上的值
	 * @param temp 当前字符串的值
	 */
	public static void doPorduce(int index,int current,String temp){
		if(index <=0){
			return;
		}
		
		if(current>9){
				doPorduce(index-1, 0,temp);
		}
		String value = replace(temp, index, current);
		print(value);
		doPorduce(index, current+1, temp);
	}
	
	public static void print(String str){
		System.out.println("---:"+str);
	}
	
	/**
	 * 将某个字符的某个位置替换成指定的值
	 * @param str 基本字符串
	 * @param index 要替换的位置,第几个
	 * @param value 替换成的值
	 * @return
	 */
	public static String replace(String str,int index ,int value){
		if(index <0){
			throw new RuntimeException("replace Exception:"+str+",index too small:"+index);
		}
		if(index > str.length()){
			throw new RuntimeException("replace Exception:"+str+",index too large:"+index);
		}
		String start = str.substring(0, index-1);
		String end = str.substring(index);
		
		return ""+start+value+end;
	}
}
