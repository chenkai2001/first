package arry;
/*通常情况下，一个类不能直接使用  需要创建一个对象才能使用
 * 1；导包
 * import 包名  类名
 * 对于在同一个包里  可以省略导包
 * 2；创建 
 * 类名 对象名= new 类名（）；
 * 如student stu =new student()
 * 3;调用
 * 对象名.成员方法
 * 对象名.方法名
 * 
 * 
 */
public class demo2student {
	public static void main(String[] args) {
		//直接创建对象就可以
		
		student stu =new student();
		//未赋值情况
		System.out.println(stu.name);//null
		System.out.println(stu.age);//初始为0
		//赋值情况
		stu.name="赵丽颖";
		stu.age=20;
		System.out.println(stu.name);
		System.out.println(stu.age);
		
		//调用方法
		stu.eat();
		stu.sleep();
		stu.study();
		
	}

}
