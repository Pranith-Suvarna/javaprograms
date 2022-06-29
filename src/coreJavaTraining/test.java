package coreJavaTraining;

public class test {

	public static void main(String[] args) {
		
		int a[] = {1,24,6,3};
		String rev = "";

		for(int i=a.length-1;i>=0;i--) {
         
			rev = rev+a[i];
	}
		System.out.println(rev);
		
	}
}
