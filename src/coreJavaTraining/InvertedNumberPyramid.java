package coreJavaTraining;

public class InvertedNumberPyramid {

public static void main(String[] args) {
	
int k=1;
 for(int i=0;i<4;i++)  //(outer for loop) this block will loop for 4 times
{
   for(int j=1;j<=4-i;j++) // inner loop
 {
     System.out.print(k);
     System.out.print("\t");
     k++;
   }
    System.out.println("");
  }
 }
}

/*

1	2	3	4	
5	6	7	
8	9	
10
	
*/

