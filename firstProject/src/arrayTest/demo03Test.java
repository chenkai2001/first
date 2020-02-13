package arrayTest;
/*
 * 
 * 
 * 
 */
public class demo03Test {
	public static void main(String[] args) {
		int[] arrayA ={1,2,3,4,5};
		int len=arrayA.length;
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);
		
		}
		System.out.println("==============");
		//调用printarrayA方法
		//传参数其实是传的数组的地址值
		printarrayA(arrayA);
		
		
	}
	
	
	/*方法的三要素
	 * 返回值类型：看是否要进行计算  有没有结果   如果有就要返回一个值没有就void
	 * 方法名
	 * 参数列表   给什么才能打印什么
	 * 
	 * 
	 * 
	 */
	public static void printarrayA(int[] arrayB){
		int[] arrayA1={3,4,5,7,9};
		for (int i = 0; i < arrayA1.length; i++) {
			System.out.println(arrayA1[i]);
		}
	}

}
