package arry;

public class demo01phoneOne {
	public static void main(String[] args) {
		phone one =new phone();
		one.brand="ƻ��";
		one.price=1000;
		one.color="black";
		System.out.println(one.brand);
		System.out.println(one.price);
		System.out.println(one.color);
		
		//���÷���
		//��Ϊ��Ա�������в�����   ����Ҫ����
		one.call("�ǲ�˹");
		one.sendmassage("С��");
		
		
	}
}
