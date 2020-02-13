package thisTest;
/*构造方法是专门用来创建对象的方法  
 * 当我们通过关键字new来创建对象时 其实就是在调用构造方法
 * 格式
 * public 类名称（参数类型   参数名称）{
 * 方法体
 * }
 * 
 * 注意事项
 * 1；构造方法的名称必须和所在的类名称完全一样  大小写也一样
 * 2；构造方法不要写返回值类型  连void也不要
 * 3；构造方法不能return一个具体返回值
 * 4；如果没有编写构造方法  编译器会给我们写一个默认的构造 
 * 		但方法体中什么都没有
 * 5 ；一旦编写了至少一个构造方法 
 *   那么编译器就不会再给我们默认构造了
 *   6；构造方法也是可以进行重载的
 *   重载：方法名相同  参数列表不同
 * 
 */
public class Student {
	
	private String name;
	private int age;
	//无参构造
	public Student(){
		System.out.println("构造方法执行了");
	}
	//全参构造
	public Student(String name,int age){
		System.out.println("全参构造方法");
		this.name=name;//参数赋值给成员变量
		this.age=age;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	
	public int getAge(){
		return age ;
	}
}	
