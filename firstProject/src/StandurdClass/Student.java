package StandurdClass;
/*һ����׼����ͨ�������¼����������
 * 1�����еĳ�Ա������Ҫʹ��private����
 * 2��Ϊÿһ����Ա����дһ��setter/getter
 * 3����дһ���޲ι��췽��
 * 4����дһ��ȫ�ι��췽��
 *
 * ������һ����׼�����javabean
 * 
 */
public class Student {

	private String name;
	private int age;
	
	
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
