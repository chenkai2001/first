package thisTest;
/*���췽����ר��������������ķ���  
 * ������ͨ���ؼ���new����������ʱ ��ʵ�����ڵ��ù��췽��
 * ��ʽ
 * public �����ƣ���������   �������ƣ�{
 * ������
 * }
 * 
 * ע������
 * 1�����췽�������Ʊ�������ڵ���������ȫһ��  ��СдҲһ��
 * 2�����췽����Ҫд����ֵ����  ��voidҲ��Ҫ
 * 3�����췽������returnһ�����巵��ֵ
 * 4�����û�б�д���췽��  �������������дһ��Ĭ�ϵĹ��� 
 * 		����������ʲô��û��
 * 5 ��һ����д������һ�����췽�� 
 *   ��ô�������Ͳ����ٸ�����Ĭ�Ϲ�����
 *   6�����췽��Ҳ�ǿ��Խ������ص�
 *   ���أ���������ͬ  �����б�ͬ
 * 
 */
public class Student {
	
	private String name;
	private int age;
	//�޲ι���
	public Student(){
		System.out.println("���췽��ִ����");
	}
	//ȫ�ι���
	public Student(String name,int age){
		System.out.println("ȫ�ι��췽��");
		this.name=name;//������ֵ����Ա����
		this.age=age;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	
	public int getAge(){
		return age ;
	}
}	
