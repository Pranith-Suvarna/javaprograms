package coreJavaTraining;

public class EvenOdd {

	public static void main(String[] args) {

		int num = 6457859;
		int even_count=0;
		int odd_count=0;
				
	     while(num>0)
	     {	    
	    	 int rem=num%10;     //9 5 8 7 5 4 6
	    	 
	    	 if(rem%2==0) {
	    		 even_count++;
	    	 }
	    	 else{
	    		 odd_count++;
	    	 }
	    	 num=num/10;
	     }
	     System.out.println("Even number count: "+even_count);
	     System.out.println("Odd number count: "+odd_count);
	}

}
