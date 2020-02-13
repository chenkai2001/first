package arrayTest;
//数组作为返回值
public class arrayReturn {
	public static void main(String[] args) {
		//调用
		//因为返回的是个数组   所以要吧这个数用数组接受
		int[] arrayA=calculate(10,20,30);
		
		System.out.println(arrayA[0]);//结果为60
	}
	public  static int[] calculate(int a,int b,int c){
		int sum=a+b+c;
		int avg=sum/3;
		int[] array ={sum,avg};
		return array;
	} 
	

}
