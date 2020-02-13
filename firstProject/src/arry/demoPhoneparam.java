package arry;
/*对象作为参数
 * 传递的是对象的地址值
 * 
 * 
 */
public class demoPhoneparam {
	public static void main(String[] args) {
		phone one =new phone();
		one.brand="苹果";
		one.price=1000;
		one.color="black";
		method(one);//传递的参数其实是对象的地址值
		
	}

	private static void method(phone param) {
		// TODO Auto-generated method stub
		System.out.println(param.brand);
		System.out.println(param.color);
		System.out.println(param.price);
	}
	
	
	

}
