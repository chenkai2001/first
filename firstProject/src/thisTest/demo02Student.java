package thisTest;

public class demo02Student {
	public static void main(String[] args) {
		Student stu = new Student();
		Student stu2 = new Student("����ӱ",20);
		
		//new �����Student���������ڵ���Student�Ĺ��췽��
		
		System.out.println("������"+stu2.getName()+"��������"+stu2.getAge());
		System.out.println("һ���");
		stu2.setAge(21);
		System.out.println("������"+stu2.getName()+"��������"+stu2.getAge());
	}

}
