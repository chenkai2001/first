package privateTest;

public class demo02Student {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("ยน๊ฯ");
		stu.setAge(20);
		stu.setMale(true);
		
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.isMale());
	}
}
