package privateTest;
/*��������������person������ʱ��   �޷���ֹ���������ֵ���ý���
 * �����������private�ؼ��ֽ���Ҫ�����ĳ�Ա������������
 * һ��ʹ��private����  ��ô��������Ȼ�����������
 * �����ڳ��������оͲ���ֱ�ӷ�����
 * ������demo01person���оͲ����Ը�����
 * 
 * ��ӷ��ʳ�Ա�������Ƕ���һ��Getter/Setter����
 *  ����setAge��������շ�������   getAgeҲһ��
 *  ����  setAge������ֵ   ����Ҫ�в���  �޷���ֵ
 *  ��getAge�ǻ�ȡֵ  û�в���  ���з���ֵ
 * 
 * 
 */
public class Person {
	String name;
	private int age;
	public void show(){
		System.out.println(name+"�� "+age);
	}
	//�����Ա���� ר��������age��������
	public void setAge(int num){
		//����if���������ѹ�
		if(num <100&&num>0){
		age=num;}
		
	}
	
	//ר�Ż�ȡage������
	public int getAge(){
		return age;
	}

}
