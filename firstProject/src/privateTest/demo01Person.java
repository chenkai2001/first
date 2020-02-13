package privateTest;

public class demo01Person {
	public static void main(String[] args) {
		Person person = new Person();
//		person.age=20;这句话有错因为age被关键字private修饰了
//		如何间接访问呢？利用setAge方法
		person.setAge(20);
		person.name="赵丽颖";
		person.show();
	}
}
