package API;

import java.util.Scanner;


/*Scanner 的类功能
 * 
 * java.long下的包不需要导
 * 使用
 * 对象名.成员方法名（）
 * 
 */
public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);//system.in表示从键盘输入
		int num= sc.nextInt();//整型数据
		String num2=sc.next();//字符串数据
		System.out.println(num);
		System.out.println(num2);
		
	}
	

}
