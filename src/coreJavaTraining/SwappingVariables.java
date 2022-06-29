package coreJavaTraining;

public class SwappingVariables {
	
	public static void main(String[] args) {

		int a= 5;
		int b =4;
		
	//	Swap with a variable
		/*
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		*/
		
		
	// Swap without variable
		a=a+b;  // a= 9
		b=a-b;  //b = 5
		a=a-b; // a= 4 
		
		System.out.println("a:"+a + " b:"+b);
		
	}
}
