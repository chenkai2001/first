package arry;

public class demoPhoneReturn {
	public static void main(String[] args) {
		//getphone�����൱��one����ķ���ֵ
		phone param = getphone();
		
		System.out.println(param.brand);
		System.out.println(param.color);
		System.out.println(param.price);
	}
	
	
	public static phone getphone(){
		phone one = new phone();
		one.brand="ƻ��";
		one.price=1000;
		one.color="black";
		return one;
	}

}
