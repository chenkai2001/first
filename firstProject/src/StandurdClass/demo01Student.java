package StandurdClass;

public class demo01Student {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.setName("�����Ȱ�");
		stu.setAge(20);
		System.out.println("������"+stu.getName()+"��������"+stu.getAge());
		Student stu2=new Student("��������",21);
		System.out.println("������"+stu2.getName()+"��������"+stu2.getAge());
		
		
	
	
	}

}
