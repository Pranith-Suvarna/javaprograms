package coreJavaTraining;

import java.util.Arrays;

public class SortArray {

public static void main(String[] args) {

	 int a[]= {2,6,1,4,9};
     int temp;
          
   for(int i=0;i<a.length-1;i++)   //Number of passes
   {
    for(int j=0;j<a.length-1;j++)   //Iterations in each pass
    {
    if(a[j] > a[j+1])
    {
       temp=a[j];
       a[j]=a[j+1];
       a[j+1]=temp;
     }
    }
  }
   System.out.println(Arrays.toString(a));
 }

}