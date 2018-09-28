
package Sorting;

public class InsertionSort 
{
    public static void main(String args[])
    {
        int[] arr={3,6,2,5,4,1,9,8,7};
        InsertionSort obj=new InsertionSort();
        obj.Insertion(arr);
    }
    
    public void Insertion(int[] arr)
    {
        for(int j=1;j<arr.length;j++)
        {
        int key=arr[j];     
        int i=j-1;
        while(i>=0 && arr[i]>key)
        {
            arr[i+1]=arr[i];
            i=i-1;
        }
        arr[i+1]=key;
        }
        
        System.out.println("Sorted array");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+ " ");
        }
        System.out.println();
    }
}
