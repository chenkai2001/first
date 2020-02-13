package variable;
/*
 * 成员变量与局部变量的三个区别
 * 1：定义的位置不同  
 * 局部变量在方法的内部
 * 成员变量在类里面  在方法的外面 
 * 一个类有成员变量和成员方法  所以 成员变量定义在方法的外面
 * 2：作用的范围不一样
 * 局部变量之恩在方法中使用
 * 成员变量可以在整个类中通用、
 * 3：默认值不一样
 * 成员变量拥有默认值
 * 局部变量必须要赋值初始化才可以
 * 4:内存位置不一样  
 * 局部变量在栈内存
 * 成员变量在堆内存
 * 5生命周期不一样 
 * 局部变量跟着方法的诞生而诞生  
 * 成员变量跟着创建的对象而产生
 */

public class variablediffrence {
	String name;
	public void method(){
		int num =20;
		System.out.println(num);
		System.out.println(name);
		//name1是局部变量不可以使用
//		System.out.println(name1);  出现错误是因为  使用范围问题
	}
	
	public void methodA(){
		int name1=17;
		System.out.println(name1);
		System.out.println(name);//这里可以使用成员变量
	}
}
