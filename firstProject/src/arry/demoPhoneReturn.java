package arry;

public class demoPhoneReturn {
	public static void main(String[] args) {
		//getphone现在相当与one对象的返回值
		phone param = getphone();
		
		System.out.println(param.brand);
		System.out.println(param.color);
		System.out.println(param.price);
	}
	
	
	public static phone getphone(){
		phone one = new phone();
		one.brand="苹果";
		one.price=1000;
		one.color="black";
		return one;
	}

}
