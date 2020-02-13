package fengzhuang;
/*
 * 面向对象  三个特性  封装  多态 继承
 * 1方法就是一种封装
 * 2关键字private是一种封装 
 * 封装就是将一些信息隐藏起来  对于外界并不可见
 * 
 * 
 * 
 */
public class demo01 {
	public static void main(String[] args) {
		int[] array ={5,15,25,20,100};
		int max =getMax(array);
		System.out.println("最大值"+max);
		
		 
	}
	//给我一个数组  我给你一个最大值
	private static int getMax(int[] array) {
		// TODO Auto-generated method stub
		int  max=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		return max;
	}

}
