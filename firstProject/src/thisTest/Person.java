package thisTest;
//�������ľֲ������ͳ�Ա����������ʱ��  
//���ݾͽ�ԭ�� ����ʹ�þֲ����� ���������Ǿֲ�������
//�����Ҫ���ʱ����еĳ�Ա����  ��Ҫʹ�ø�ʽ
//this.��Ա����
public class Person {
	String name;
	//who�ǶԷ�������  �ǲ���
	//name�����Լ�������
	public void sayHello(String name){
		System.out.println(name+"���,"+"����"+this.name);
		//˭�������sayHello����   this�ʹ����Ǹ�����
		System.out.println(this);
	}

}
