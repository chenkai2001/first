package demo;
/*ʲôʱ���÷�������
 * �𣺹������Ƶ�ʱ��   �������÷�������ͬ ���ܲ�ͬ ��������ͬ
 * 
 * ʲô��������֮�󹹳ɷ������ء�
 * ��	ͬһ������     ��������ͬ      ������ͬ ����������ͬ  ˳��ͬ ���Ͳ�ͬ��
 * 
 * �������غͷ������Ͳ����б��й�   �ͷ���ֵ�����޹�
 * �����η��޹�
 * 
 */
public class OverloadTest02 {
	public static void main(String[] args) {
		m1();
		m1(5);
		
		m2(2.0,3);
		
		
	}
	//��������������������
	public static void m1(){
		System.out.println("haha");
	}
	public static void m1(int a){
		System.out.println(a);
	}
	
	//��������������������
	public static void m2(double a,int b){
		System.out.println(a+b);
	}
	public static void m2(int a,double b){
		System.out.println(a+b);
	}
	
	//��������������������
	public static void m3(int x){}
	public static void m1(double x){}
	
	
	//����������������������
	//public static void m1(int a,int b){}
	//public static void m1(int b,int a ){}

}
