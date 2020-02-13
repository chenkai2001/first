package thisTest;

public class demo01Person {
	public static void main(String[] args) {
		Person person =new Person();
		//设置我自己的名字
		person.name="王健林";
		person.sayHello("王思聪");
		System.out.println(person);
		//会发现这个地址值和person类中this地址值一样
		
	}

}
