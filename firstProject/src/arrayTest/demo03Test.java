package arrayTest;
/*
 * 
 * 
 * 
 */
public class demo03Test {
	public static void main(String[] args) {
		int[] arrayA ={1,2,3,4,5};
		int len=arrayA.length;
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);
		
		}
		System.out.println("==============");
		//����printarrayA����
		//��������ʵ�Ǵ�������ĵ�ֵַ
		printarrayA(arrayA);
		
		
	}
	
	
	/*��������Ҫ��
	 * ����ֵ���ͣ����Ƿ�Ҫ���м���  ��û�н��   ����о�Ҫ����һ��ֵû�о�void
	 * ������
	 * �����б�   ��ʲô���ܴ�ӡʲô
	 * 
	 * 
	 * 
	 */
	public static void printarrayA(int[] arrayB){
		int[] arrayA1={3,4,5,7,9};
		for (int i = 0; i < arrayA1.length; i++) {
			System.out.println(arrayA1[i]);
		}
	}

}
