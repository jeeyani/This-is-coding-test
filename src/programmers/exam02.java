package programmers;

import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		

	int a = 3000;
	int b = 5000;
    int money = 23000;
    int count =0;
    int res=0;
   
   if(money%a==0) {
	   count++;
   }
   if(money%b==0) {
	   count++;
   }
    
  for (int i = a; i < money; i+=a) {
	  for (int j = b; j < money-i; j+=b) {
		  if(res + (i+j)>money) {
			  break;
			}
			
			res +=(i+j);
			count++;
	}

  }
    	 
   System.out.print(count);  
   
    }
}
