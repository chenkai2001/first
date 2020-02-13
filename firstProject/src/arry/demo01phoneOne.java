package arry;

public class demo01phoneOne {
	public static void main(String[] args) {
		phone one =new phone();
		one.brand="苹果";
		one.price=1000;
		one.color="black";
		System.out.println(one.brand);
		System.out.println(one.price);
		System.out.println(one.color);
		
		//调用方法
		//因为成员方法是有参数的   所以要传参
		one.call("乔布斯");
		one.sendmassage("小明");
		
		
	}
}
