package helpqy;

public class paixu2 {
	public static void main(String[] args) {
		System.out.println(xixi(7,3,9));
		
	}
	
	public static int xixi(int a,int b,int c){
		
		 int max = (a>b)?a:b;
		 max = (max>c)?max:c;
		 return max;
	}

	}


//求最大值

/*int max=array[0];
 * 
 *  for(int i =1;i<array.length;i++){
 * 		if(max<array[i]){
 * 		max=array[i]
 * }
 * 
 * }
 */


