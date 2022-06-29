package coreJavaTraining;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "madam";
		String rev = "";

		for(int i=str.length()-1;i>=0;i--) {
         
			rev = rev+str.charAt(i);
	}
		System.out.println(rev);
		
		if(str.equals(rev)) 
			System.out.println("It's a palindrome");
		
		/*
		StringBuffer sBuffer = new StringBuffer("madam");
	      sBuffer.reverse();
	      System.out.println(sBuffer);  
	    */
		
		/* Reverse an array
		int a[] = {1,24,6,3};
		String rev = "";

		for(int i=a.length-1;i>=0;i--) {
         
			rev = rev+a[i];
	}
		System.out.println(rev); 
		*/
		
  }
}
