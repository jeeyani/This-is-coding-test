package ch06_Sorting;

public class example6_1 {

	public static void main(String[] args) {
	
		int[] arry = {7,5,9,0,3,1,6,2,4,8};
		int temp=0;
		
		for (int i = 0; i < arry.length-1; i++) {
			
			for (int j = i+1; j < arry.length; j++) {
				
				if(arry[i]>arry[j]) {
					temp = arry[i];
					arry[i]=arry[j];
					arry[j] =temp;
				}
			}
		}
		
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i]+" ");
		}

	}

}
