package arry;
/*������Ϊ����
 * ���ݵ��Ƕ���ĵ�ֵַ
 * 
 * 
 */
public class demoPhoneparam {
	public static void main(String[] args) {
		phone one =new phone();
		one.brand="ƻ��";
		one.price=1000;
		one.color="black";
		method(one);//���ݵĲ�����ʵ�Ƕ���ĵ�ֵַ
		
	}

	private static void method(phone param) {
		// TODO Auto-generated method stub
		System.out.println(param.brand);
		System.out.println(param.color);
		System.out.println(param.price);
	}
	
	
	

}
