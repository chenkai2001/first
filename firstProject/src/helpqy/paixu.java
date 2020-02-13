package helpqy;

public class paixu {
	public static void main(String[] args) {
		index();
		
	}
	public static void  index(){
		int [] num={7,3,9};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length-i-1; j++) {
				if(num[j]>num[j+1]){
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
				
			}
		
			
			
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
