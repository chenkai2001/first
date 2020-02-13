package demo;
/*什么时候用方法重载
 * 答：功能相似的时候   尽可能让方法名相同 功能不同 方法名不同
 * 
 * 什么条件满足之后构成方法重载、
 * 答：	同一个类中     方法名相同      参数不同 （如数量不同  顺序不同 类型不同）
 * 
 * 方法重载和方法名和参数列表有关   和返回值类型无关
 * 和修饰符无关
 * 
 */
public class OverloadTest02 {
	public static void main(String[] args) {
		m1();
		m1(5);
		
		m2(2.0,3);
		
		
	}
	//以下俩个方法构成重载
	public static void m1(){
		System.out.println("haha");
	}
	public static void m1(int a){
		System.out.println(a);
	}
	
	//以下俩个方法构成重载
	public static void m2(double a,int b){
		System.out.println(a+b);
	}
	public static void m2(int a,double b){
		System.out.println(a+b);
	}
	
	//以下俩个方法构成重载
	public static void m3(int x){}
	public static void m1(double x){}
	
	
	//以下俩个方法不构成重载
	//public static void m1(int a,int b){}
	//public static void m1(int b,int a ){}

}
