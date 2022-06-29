package coreJavaTraining;

public class ReverseNum {

	public static void main(String[] args) {

		int num =5438;
		int rev =0;
		
		while(num!=0)
		{	
		rev = rev*10 + num%10; 
		num=num/10;
		}
		System.out.println(rev);
		
		
	/*	StringBuffer s = new StringBuffer(String.valueOf(num));
		s.reverse();
		System.out.println(rev); 
    */

		
	}

}
