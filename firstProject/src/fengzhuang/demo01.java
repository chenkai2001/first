package fengzhuang;
/*
 * �������  ��������  ��װ  ��̬ �̳�
 * 1��������һ�ַ�װ
 * 2�ؼ���private��һ�ַ�װ 
 * ��װ���ǽ�һЩ��Ϣ��������  ������粢���ɼ�
 * 
 * 
 * 
 */
public class demo01 {
	public static void main(String[] args) {
		int[] array ={5,15,25,20,100};
		int max =getMax(array);
		System.out.println("���ֵ"+max);
		
		 
	}
	//����һ������  �Ҹ���һ�����ֵ
	private static int getMax(int[] array) {
		// TODO Auto-generated method stub
		int  max=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		return max;
	}

}
