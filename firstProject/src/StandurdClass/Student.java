package StandurdClass;
/*一个标准的类通常有以下几个部分组成
 * 1；所有的成员变量都要使用private修饰
 * 2；为每一个成员变量写一对setter/getter
 * 3；编写一个无参构造方法
 * 4；编写一个全参构造方法
 *
 * 这样的一个标准的类叫javabean
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
