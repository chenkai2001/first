package arrayTest;
//������Ϊ����ֵ
public class arrayReturn {
	public static void main(String[] args) {
		//����
		//��Ϊ���ص��Ǹ�����   ����Ҫ����������������
		int[] arrayA=calculate(10,20,30);
		
		System.out.println(arrayA[0]);//���Ϊ60
	}
	public  static int[] calculate(int a,int b,int c){
		int sum=a+b+c;
		int avg=sum/3;
		int[] array ={sum,avg};
		return array;
	} 
	

}
