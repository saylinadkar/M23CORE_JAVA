package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionExample 
{
	private static String REGEXP="[";
	private static String INPUT="I love Mumbai and Mumbai is famous for bollywod city";
	private static String REPLACE="PUNE";
	public static void main(String[] args) {
		try
		{
			Pattern p=Pattern.compile(REGEXP);
		
			Matcher m=p.matcher(INPUT);
		
			INPUT=m.replaceAll(REPLACE);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("Description: "+e.getDescription());
			System.out.println("Description: "+e.getIndex());
	        System.out.println("Index: "+ e.getIndex());
	        System.out.println("Message: "+ e.getMessage());
	        System.out.println("Pattern: "+ e.getPattern());

		}
		

	}

}