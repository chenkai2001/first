package API;

import java.util.Scanner;

public class demo02Anonymous {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num =sc.nextInt();
		//ʹ����������ʽ
//		int num = new Scanner(System.in).nextInt();
//		һ�㴫�η�ʽ
//		Scanner sc = new Scanner(System.in);
//		methodparam(sc);
//		ʹ���������󴫲�
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
