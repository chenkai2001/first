package thisTest;
//当方法的局部变量和成员变量重名的时候  
//根据就近原则 优先使用局部变量 （参数就是局部变量）
//如果需要访问本类中的成员变量  需要使用格式
//this.成员变量
public class Person {
	String name;
	//who是对方的名字  是参数
	//name是我自己的名字
	public void sayHello(String name){
		System.out.println(name+"你好,"+"我是"+this.name);
		//谁调用这个sayHello方法   this就代表那个对象
		System.out.println(this);
	}

}
