
package Array;

public class ArrayRotation {    // pascal case
    
    public static void main(String[] args) {
       
        int[] a=new int[5];
        int[] b=new int[5];
        int len=a.length;
        for(int i=0;i<len;i++)
        {
            a[i]=i;
            System.out.print(a[i] + "  ");
        }
        
        System.out.println("Rotated array");
        for(int i=(len/2);i<len;i++)
        {
        b[i-2]=a[i];
        }
        for(int i=0;i<(len/2);i++)
        {
        b[i+3]=a[i];
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(b[i] + " ");
        }
        
        
       } 
       } 
