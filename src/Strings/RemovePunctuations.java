import Sorting.InsertionSort;
public class RemovePunctuations
{
	public static void main(String[] args)
	{
		// input string
		String str = "Welcome ???@@##$ to#$% Geeks%$^for$%^&Geeks";
		
		// similar to Matcher.replaceAll
		str = str.replaceAll("\\p{Punct}","");
                
		
		System.out.println(str);
                
	}
	
}