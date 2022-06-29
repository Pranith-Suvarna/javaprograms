package coreJavaTraining;
public class MaxnumberinMultiArray {

	
public static void main(String[] args) {

int abc[][]={{2,4,5},{3,2,10},{1,2,0}};
int min=abc[0][0];
int mincoloumn = 0;


for(int i=0;i<abc.length;i++)
{
   for(int j=0;j<abc.length;j++)
{
    if(abc[i][j]<min)//2
  {
    min=abc[i][j];
    mincoloumn=j;
   }
 }
}
 System.out.println("minimum number in the array: "+ min);

int max=abc[0][mincoloumn];
int k = 0;
while(k<3)
{
  if(abc[k][mincoloumn]>max)
 {
    max=abc[k][mincoloumn];
  }
 k++;
}

 System.out.println("maximum number in the array: "+ max);
}

}