
package Sorting;
import Sorting.InsertionSort;
public class QuickSort 
{
    public static void main(String[] args) 
    {
        int[] arr={9,6,5,0,8,2,4,7};
        System.out.println("Given array");
        printArray(arr);
        QuickSort obj=new QuickSort();
        obj.quick_Sort(arr,0,arr.length-1);
        System.out.println("Sorted array");
        printArray(arr);
        
    }
    
    int partition(int[] arr,int p,int r)
    {
     int P=p;
     int R=r;
     int x=arr[R];
     int i=P-1;
        
     for(int j=P;j<R;j++)
     {
         if(arr[j]<=x)
         {
             i=i+1;
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }
     }
     int temp2=arr[i+1];
     arr[i+1]=arr[r];
     arr[r]=temp2;  
     return i+1;
    }
    
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }
    
    void quick_Sort(int[] arr,int p,int r)
    {
        if(p<r)
        {
            int q=partition(arr,p,r);
            
            quick_Sort(arr,p,q-1);
            quick_Sort(arr,q+1,r);
        }
    }
    
}
