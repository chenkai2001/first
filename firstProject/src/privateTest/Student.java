package privateTest;
/*
 * ���ڻ������͵�booleanֵ  getter����һ��Ҫд��isXxx��ʽ
 * ��setXxx��ʽ����
 * 
 * 
 */
public class Student {
	private String name;
	private int age;
	private boolean male;
	
	public void setMale(boolean male1){
		male=male1;
		
	}
	
	public boolean isMale(){
		return male;
	}
	
	
	public void setName(String str){
		name=str;
	}
	
	public  String getName(){
		return name;
	}
	
	public  void setAge(int num){
		age=num;
	}
	
	public int getAge(){
		return age;
	}
	
	

}
