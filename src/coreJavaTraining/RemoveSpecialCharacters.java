package coreJavaTraining;

public class RemoveSpecialCharacters {

	
	public static void main(String[] args) {
		
		String s = "k$ 6^$#^&9";
		String s2=s.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(s2);
	}
}
