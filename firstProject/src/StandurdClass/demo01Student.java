package StandurdClass;

public class demo01Student {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.setName("迪丽热巴");
		stu.setAge(20);
		System.out.println("名字是"+stu.getName()+"今年多大了"+stu.getAge());
		Student stu2=new Student("古力娜扎",21);
		System.out.println("名字是"+stu2.getName()+"今年多大了"+stu2.getAge());
		
		
	
	
	}

}
