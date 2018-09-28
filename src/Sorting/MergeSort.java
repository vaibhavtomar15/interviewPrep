
package Sorting;
public class MergeSort 
{
    
    public static void main(String args[])
    {
     int[] arr={8,7,6,5,4,3,9,1};
     printArray(arr);
    
     MergeSort obj=new MergeSort();
     obj.Merge_Sort(arr,0,arr.length-1);
     
     System.out.println("\nSorted array");
     printArray(arr);
     System.out.println();
    }
    
    void Merge(int[] arr,int p,int q,int r)
    {
       int n1=q-p+1;
       int n2=r-q;
       int[] left=new int[n1];
       int[] right=new int[n2];       
       
       for(int i=0;i<n1;++i)
       {
           left[i]=arr[p+i];
        
       }
       
       for(int j=0;j<n2;++j)
       {
           right[j]=arr[q+j+1];
       }
       
       int i=0;int j=0;
       int k=0;
       while(i < n1 && j < n2)
       {
           if(left[i]<=right[j])
           {
               arr[k]=left[i];
               i++;
           }
           else
           {
               arr[k]=right[j];
               j++;
           }
           k++;
       }
       
       while(i<n1)
       {
        arr[k]=left[i];
        i++;
        k++;
       }
       while(j<n2)
       {
           arr[k]=right[j];
           j++;
           k++;
       }
       
    }
    
     void Merge_Sort(int[] arr,int p,int r)
    {
    if(p<r)
        {
        int q =(p+r)/2;
        Merge_Sort(arr,p,q);
        Merge_Sort(arr,q+1,r);
        Merge(arr,p,q,r);
        }
    }
    
    static void printArray(int[] arr)
     {
         
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(" " + arr[i]);
             
         }
     }
    
} // class MergeSort ends
