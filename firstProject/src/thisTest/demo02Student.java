package thisTest;

public class demo02Student {
	public static void main(String[] args) {
		Student stu = new Student();
		Student stu2 = new Student("赵丽颖",20);
		
		//new 后面的Student（）就是在调用Student的构造方法
		
		System.out.println("名字是"+stu2.getName()+"今年多大了"+stu2.getAge());
		System.out.println("一年后");
		stu2.setAge(21);
		System.out.println("名字是"+stu2.getName()+"今年多大了"+stu2.getAge());
	}

}
