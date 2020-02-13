package API;



/*匿名对象如何构造
 * 匿名对象就是没有左边的名字
 * 注意事项
 * 匿名对象只能使用唯一的一次   下次再使用要创建一个新的对象、
 * 如果确定对象只需要使用一次  就可以用匿名对象
 * 
 * 
 */
public class Anonymous {
	
	public static void main(String[] args) {
		
		new Person().name="高圆圆";
		
		new Person().showName();//我叫null
		
	}

}
