
package Strings;
import Strings.Input;

public class PalindromeString 
{
    public static void main(String[] args) 
    {
        String str=Input.StaticInput();
      
        check(str);
    }
    static void check(String str)
    {
        char[] ch=str.toCharArray();
        String[] sArray=new String[10];
        String[] sCheck=new String[10];
        String s="";
        int k=0;
        for(int i=0;i<str.length();i++)
        {
            s="";
            while(i<ch.length && ch[i]!=' ')
            {
                s=s+ch[i];
                i++;
            }
            sArray[k]=s;
            k++;
                        
        } 
        int temp=k; //Number of words
        int m=0;
        for(int i=temp-1;i>=0;i--)
        {
          sCheck[i]=sArray[i];
          m++; //number of characters 
          for(int n=0;n<m;n++)
          {
              
          }
        }
        }
        
    }
    

