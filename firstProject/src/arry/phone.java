package arry;
/*定义一个类 用来模拟手机事物
 * 属性：品牌价格 颜色 大小
 * 行为：打电话 发短信
 * 
 * 
 * 
 */

public class phone {
	String brand;
	double price;
	String color;
	public void call(String who){
		System.out.println("给"+who+"打电话");
		
	};
	public void sendmassage(String who){
		System.out.println("给"+who+"发短信");
		
	};

}
