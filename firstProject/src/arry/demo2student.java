package arry;
/*ͨ������£�һ���಻��ֱ��ʹ��  ��Ҫ����һ���������ʹ��
 * 1������
 * import ����  ����
 * ������ͬһ������  ����ʡ�Ե���
 * 2������ 
 * ���� ������= new ����������
 * ��student stu =new student()
 * 3;����
 * ������.��Ա����
 * ������.������
 * 
 * 
 */
public class demo2student {
	public static void main(String[] args) {
		//ֱ�Ӵ�������Ϳ���
		
		student stu =new student();
		//δ��ֵ���
		System.out.println(stu.name);//null
		System.out.println(stu.age);//��ʼΪ0
		//��ֵ���
		stu.name="����ӱ";
		stu.age=20;
		System.out.println(stu.name);
		System.out.println(stu.age);
		
		//���÷���
		stu.eat();
		stu.sleep();
		stu.study();
		
	}

}
