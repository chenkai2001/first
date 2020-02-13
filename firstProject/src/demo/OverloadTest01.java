package demo;
/*
 * 
 * 方法的重载   只需要调用相同的函数名即可完成相似的功能 
 *  这里的sum()就是相同的方法名
 *  调用的参数不同  方法功能不同
 *  
 */

import myclass.U;

public class OverloadTest01 {
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1.0,2.0));
		System.out.println(sum(1L,2L));
		
	}
	
	public static int sum(int a,int b) {
		return a+b;
		
	}
	
	public static double sum(double a,double b) {
		return a+b;
		
	}
	public static long sum(long a,long b) {
		return a+b;
		
	}
	

	

}
