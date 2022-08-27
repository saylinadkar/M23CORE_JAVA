package regexp;

import java.util.Scanner;
import java.util.regex.Pattern;
//Demo on matches() method of a pattern class
public class PatternMatchesMethod {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String pattern="JAVA#&Programming";
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
	}

}