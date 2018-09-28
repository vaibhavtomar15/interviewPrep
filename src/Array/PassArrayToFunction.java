
package Array;

public class PassArrayToFunction {
    
    public static void main(String[] args) 
    {
        int[] a=new int[5];
        a[2]=1;
        changeA(a);
        System.out.println("value of a[2] = " + a[2]);
    }
   private static void changeA(int[] a)
   {
       a[2]=5;
       
   }
    
}
