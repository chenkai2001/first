package arrayTest;

/*�������ַ�����  �ַ�������  ��������ȵ�
 * ����һ������  ��������ʱ�򳤶Ȳ��ɸı�
 * ��̬��ʼ��һ��ʹ����ʡ�Ը�ʽ�Ͳ��ܲ��Ϊ����������
 * ��ָ̬������  int[] arrayA = {2,3,4,5};
 * ��ָ̬����С int[] arrayC = new int[5];
 * ����������������׵�ַ
 * ������ַ�����  Ĭ��Ϊ\u0000
 */
public class demo02array {
	
	public static void main(String[] args) {
		int[] arrayA = {2,3,4,5};//��̬
		int[] arrayC = new int[5];//��̬
		String[] arrayB ={"hello","world","java"};//��̬
		System.out.println(arrayA[0]);
		System.out.println(arrayA);//[I@15db9742 
		System.out.println(arrayC[1]);//arrayBδ��ֵ  Ĭ�ϳ�ʼΪ0
	}
	
}
