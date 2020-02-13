package privateTest;
/*问题描述：定义person的年龄时候   无法阻止不合理的数值设置进来
 * 解决方案：用private关键字将需要保护的成员变量进行修饰
 * 一旦使用private修饰  那么本类中依然可以随意访问
 * 但是在超出本类中就不能直接访问了
 * 比如在demo01person类中就不可以更改了
 * 
 * 间接访问成员变量就是定义一对Getter/Setter方法
 *  其中setAge必须符合驼峰命名法   getAge也一样
 *  其中  setAge是设置值   必须要有参数  无返回值
 *  而getAge是获取值  没有参数  且有返回值
 * 
 * 
 */
public class Person {
	String name;
	private int age;
	public void show(){
		System.out.println(name+"， "+age);
	}
	//这个成员方法 专门用于向age设置数据
	public void setAge(int num){
		//利用if进行质量把关
		if(num <100&&num>0){
		age=num;}
		
	}
	
	//专门获取age的数据
	public int getAge(){
		return age;
	}

}
