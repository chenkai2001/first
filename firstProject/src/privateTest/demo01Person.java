package privateTest;

public class demo01Person {
	public static void main(String[] args) {
		Person person = new Person();
//		person.age=20;��仰�д���Ϊage���ؼ���private������
//		��μ�ӷ����أ�����setAge����
		person.setAge(20);
		person.name="����ӱ";
		person.show();
	}
}
