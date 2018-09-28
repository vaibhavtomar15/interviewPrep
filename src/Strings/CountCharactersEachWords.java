
package Strings;
import Strings.Input;

public class CountCharactersEachWords 
{
    public static void main(String[] args) 
    {
        String str=Input.StaticInput();
        if(str.equals(str));
        count(str);
      
        
    }
    
    static void count(String S)
    {
        
        char[] ch=S.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            
            String s="";
            while(i<ch.length && ch[i]!=' ')
            {
            s=s+ch[i];
            i++;
            }
            
            if(s.length()>0)
            System.out.println(s+ "->"+s.length() );
            
        }
    }
}
