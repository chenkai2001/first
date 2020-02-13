package privateTest;
/*
 * 对于基本类型的boolean值  getter方法一定要写成isXxx形式
 * 而setXxx形式不变
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
