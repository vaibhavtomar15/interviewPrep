package Strings;
import Strings.Input;

public class SwapFirstLastCharacter 
{
     
    public static void main(String[] args) 
    {
    String str=Input.StaticInput();
    String s=swap(str);
    System.out.println(s);
        
    }
    
    static String swap(String str)
    {
        char[] chars = str.toCharArray();
        // itirate over each character
        for(int i=0;i<str.length();i++)
        {
            int k=i;
            
            while(i < chars.length && chars[i] !=' ')
            {
                i++;
            }
            char temp=chars[i-1];
            chars[i-1]=chars[k];
            chars[k]=temp;
        }
        //Converting character Array to String;  
        String S=new String(chars);
        return S;           //return new String(chars);
    }
    
}
