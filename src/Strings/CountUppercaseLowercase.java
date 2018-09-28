package Strings;
import Strings.Input;
public class CountUppercaseLowercase
{
    public static void main(String[] args) 
    {
    String str=Input.StaticInput();
    str=str.concat("!*^%@DH__");
    Calculate(str);
    
    }
    static void Calculate(String str)
    {
        char[] ch=str.toCharArray();
        int lowerCount=0;
        int upperCount=0;
        int specialCount=0;
        for(int i=0;i<ch.length;i++)
        {
            int ascii=ch[i];
            if(ascii>=65 && ascii<=92)
            {
                upperCount++;
            }
            if(ascii>=97 && ascii<=122)
            {
                lowerCount++;
            }
            if(ascii>=48 && ascii<=57)
            {
                specialCount++;
            }
            
        }
        System.out.println("Total Upper case Characters = " + upperCount);
        System.out.println("Total Lower case Characters = " + lowerCount);
        System.out.println("Total Special Characters = " + specialCount);
        
    }
    
}
