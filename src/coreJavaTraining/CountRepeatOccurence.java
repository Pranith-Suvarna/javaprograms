package coreJavaTraining;

public class CountRepeatOccurence {

	public static void main(String[] args) {

		
		String s = "test";
		char c ='t';
		
	/*	
		int count =0;
		
		for (int i=0;i<s.length();i++) {
		
			if(s.charAt(i)==c)
				count++;
				
	}
      System.out.println(count);
    */
		
      int l1 = s.length();
      int l2 = s.replaceAll("t", "").length();
      int repeat = l1-l2;
      System.out.println(repeat);
	}			

}
