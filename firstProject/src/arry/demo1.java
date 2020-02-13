package arry;

/*数组作为方法的返回值
 * 
 * 
 */
public class demo1 {
	public static void main(String[] args) {
		int [] result= calculate(10,20,30);
		System.out.println(result);
		System.out.println(result[0]);
		System.out.println(result[1]);
				
	}

	private static int[] calculate(int a, int b, int c) {
		// TODO Auto-generated method stub
		int sum= a+b+c;
		int avg=sum/3;
		int [] array ={sum,avg};
		/*int [] array =new int[2];
		 * int [0]=sum;
		 * int [1]=avg;
		 */
		return array;
	}
}
