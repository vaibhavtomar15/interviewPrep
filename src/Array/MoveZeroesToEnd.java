
package Array;

public class MoveZeroesToEnd {
public static void main(String args[])
{
    int[] arr=new int[7];

    int len=arr.length;
    int count=0;
    
    //input elements
    for(int i=0;i<len;i++)
    {
    if(i%2==0)
        arr[i]=1;
    if(i%2!=0)
        arr[i]=0;
    System.out.print(" "+ arr[i]);
    }

    //segregation of one's and zero's
   for(int i=0;i<len;i++)
   {
   if(arr[i] !=0)
       arr[count++] = arr[i];
   }
   
   for(int i=count;i<len;i++)
       arr[count++]=0;
   
   
   
   // printing
    System.out.println("\nPrinting Segregated Array");
   for(int i=0;i<len;i++)
   {
    System.out.print( " " + arr[i]);
   }
    System.out.println();
} //main ends
} //class ends
