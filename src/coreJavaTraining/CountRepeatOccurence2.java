package coreJavaTraining;

import java.util.HashMap;

public class CountRepeatOccurence2 {

	public static void main(String[] args) {


		String s = "kareena";
		
		char[] charArray = s.toCharArray();
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(char c : charArray)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, 1);
			}
		}
         System.out.println(charMap);
	}
}