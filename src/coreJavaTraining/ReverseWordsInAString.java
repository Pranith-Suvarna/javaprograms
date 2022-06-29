package coreJavaTraining;

public class ReverseWordsInAString {

	public static void main(String[] args) {

		String s = "Welcome to Java";
		
		String[] words = s.split(" ");
		
		String reversed_string = "";
		
	/*	
		for(String w :words) {
			 
	    String reversed_word="";
	    
	    for(int i=w.length()-1;i>=0;i--)
	    {
	    	reversed_word = reversed_word + w.charAt(i);
	    }
	    reversed_string = reversed_string + reversed_word+" ";
		}
		
		System.out.println(reversed_string);
	*/	
		
		for(String w :words) {
			
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reversed_string=reversed_string+sb.toString()+" ";
			
		} 
		
		System.out.println(reversed_string);
		
	}
	
}
	
