package API;

import java.util.Scanner;

public class demo02Anonymous {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num =sc.nextInt();
		//使用匿名对象方式
//		int num = new Scanner(System.in).nextInt();
//		一般传参方式
//		Scanner sc = new Scanner(System.in);
//		methodparam(sc);
//		使用匿名对象传参
//	methodparam(new Scanner(System.in));
		Scanner sc =methodparam();
		int num =sc.nextInt();
		System.out.println(num);
		
	}

	private static Scanner methodparam() {
		// TODO Auto-generated method stub
		return new Scanner(System.in);
	}
	

}
