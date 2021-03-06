
public class Strings {
	public static void main(String args[]) {

		// Java String
		
		String s1 = "John Daniel";// creating string by Java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating Java string by new keyword
		String s4 = new String("john daniel");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		// Java String format()

		String str1 = String.format("%d", 101); // Integer value
		String str2 = String.format("%s", "Amar Singh"); // String value
		String str3 = String.format("%f", 101.00); // Float value
		String str4 = String.format("%x", 101); // Hexadecimal value
		String str5 = String.format("%c", 'c'); // Char value
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

		// Java String length()

		System.out.println("string length is: " + s1.length());// 11 is the length of John Daniel string
		System.out.println("string length is: " + s2.length());// 6 is the length of strings string

		// Accessing First and Last Character by Using the charAt()
		String str = "Welcome to John Daniel's portal";
		//int strLength = str.length();
		// Fetching first character
		System.out.println("Character at 0 index is: " + str.charAt(0));
		// The last Character is present at the string length-1 index
		//System.out.println("Character at last index is: " + str.charAt(strLength - 1));

		// Java String length() Ex 2

		if (str.length() > 0) {
			System.out.println("String is not empty and length is: " + str.length());
		}
		str = "";
		if (str.length() == 0) {
			System.out.println("String is empty now: " + str.length());
		}

		// Java String substring()

		String substr = s1.substring(0); // Starts with 0 and goes to end
		System.out.println(substr);
		String substr2 = s1.substring(5, 10); // Starts from 5 and goes to 10
		System.out.println(substr2);
		// String substr3 = s1.substring(5,15); // Returns Exception

		// Java String contains Boolean ()

		String name = "what do you know about me";
		System.out.println(name.contains("do you know"));
		System.out.println(name.contains("about"));
		System.out.println(name.contains("hello"));
		// EX 2
		String str0 = "We Born alone,die alone.Everything else is an illusion";
		if (str0.contains("illusion")) {
			System.out.println("This string contains illusion");
		} else
			System.out.println("Result not found");

		// Java String join()

		String date = String.join("/", "25", "06", "2018");
		System.out.print(date);
		String time = String.join(":", "12", "10", "10");
		System.out.println(" " + time);

		// Java String equals() True Or False

		System.out.println(s1.equals(s2)); // True because content is same
		if (s1.equals(s3)) {
			System.out.println("both strings are equal");
		} else
			System.out.println("both strings are unequal");

		// Java String isEmpty()

		if (s1.length() == 0 || s1.isEmpty())
			System.out.println("String s1 is empty");
		else
			System.out.println(s1);
		if (s2.length() == 0 || s2.isEmpty())
			System.out.println("String s2 is empty");
		else
			System.out.println(s2);

		// Java String concat()

		// Concatenating one string
		String str6 = str1.concat(str2);
		System.out.println(str6);
		// Concatenating multiple strings
		String str7 = str1.concat(str2).concat(str3);
		System.out.println(str7);

		// Java String replace

		String replaceString = s1.replace('n', 'm');// replaces all occurrences of 'n' to 'm'
		System.out.println(replaceString);

		// Java String equalsIgnoreCase()

		System.out.println(s1.equalsIgnoreCase(s2));// false because content is not same
		System.out.println(s1.equalsIgnoreCase(s3));// false because content is not same
		System.out.println(s1.equalsIgnoreCase(s4));// true because case is ignored

		// Java String split()

		String[] words = s1.split("\\s");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}

	}

}
