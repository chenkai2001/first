package arrayTest;

/*数组有字符数组  字符串数组  整型数组等等
 * 数组一旦创建  程序运行时候长度不可改变
 * 静态初始化一旦使用了省略格式就不能拆分为俩个步骤了
 * 动态指定内容  int[] arrayA = {2,3,4,5};
 * 静态指定大小 int[] arrayC = new int[5];
 * 数组名称是数组的首地址
 * 如果是字符类型  默认为\u0000
 */
public class demo02array {
	
	public static void main(String[] args) {
		int[] arrayA = {2,3,4,5};//动态
		int[] arrayC = new int[5];//静态
		String[] arrayB ={"hello","world","java"};//动态
		System.out.println(arrayA[0]);
		System.out.println(arrayA);//[I@15db9742 
		System.out.println(arrayC[1]);//arrayB未赋值  默认初始为0
	}
	
}
