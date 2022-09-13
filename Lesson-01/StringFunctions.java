package Demo;

public class StringFunctions {
	public static void main(String[] args) {
		// initialize some of the string variables 
		String str1 = "Hello Learner How are you";
		
		System.out.println("String operations program demonstration");
		
		System.out.println("Getting character at specific position: " + str1.charAt(4));
		
		System.out.println("Getting Unicode character at specific index: "+ str1.codePointAt(1));
		
		System.out.println("Getting unicode character of its previous index: "+ str1.codePointBefore(2));
		
		System.out.println("count of unicode characters between index: "+ str1.codePointCount(0, 5));
		
		// string comparision functions
		String str2 = "Hello Learner";
		String str3 = "HELLO LEARNER";
		
		System.out.println("character count of the stirng: "+ str1.length());
		System.out.println("Compare the strings: "+ str1.compareTo(str3));
		
		System.out.println("Comparing strings by ignoring case: "+ str2.compareToIgnoreCase(str3));
		
		System.out.println("Appending one string with another: "+ str1.concat(str3));
		System.out.println("Appending one string with another: "+ str1+str3);
		
		
		System.out.println("Is string 1 contains string2: "+ str1.contains(str3));
		
		System.out.println("Is string1 ending with you: "+ str1.endsWith("you"));
		
		System.out.println("Is string1 starting with H: " + str3.startsWith("HELLO"));
		
		String str4 = "HELLO LEARNER How are you";
		System.out.println("Is string1 equal to string2 : "+ str1.equals(str4));
		
		System.out.println("Is string1 equal to string2 case insensitive comparision: "+ str1.equalsIgnoreCase(str4));
		
		// s[0] * 31^(n-1) + s[1]*31^(n-2)+.....
		System.out.println("hash code of the stirng is: "+ str1.hashCode());
		
		System.out.println("Position of l in string1 is: "+ str1.indexOf("o"));
		
		str4 = "";
		System.out.println("Is string empty? "+ str4.isEmpty());
		
		str4 = "Hello how is Hello world this is string program on Hello strings";
		System.out.println("Position of first occurence of H: "+ str4.indexOf("is"));
		
		System.out.println("Position of first occurence of H: "+ str4.lastIndexOf("Hello"));
	
		System.out.println("original string is: "+ str4);
		System.out.println("Replacing substring with another string in string: "+ str4.replace("Hello", "Java"));
		System.out.println("original string is: "+ str4);
		
		System.out.println("replacing only the first occurrence: "+ str4.replaceFirst("Hello", "Java"));
		
		System.out.println("original string is: "+ str4);
		System.out.println("string converted to lower case: "+ str4.toLowerCase());
		
		System.out.println("string converted to upper case: "+ str4.toUpperCase());
		
		String str5 = "   I am a string   ";
		System.out.println("Original string str5 is: "+ str5);
		System.out.println("String after trimming: "+ str5.trim());
		System.out.println("String after trimming: " + str5.strip());
		
		System.out.println("remvoing leading spaces only: "+ str5.stripLeading());
		System.out.println("removing trailing spaces only: " + str5.stripTrailing());
	
		String str6 = "Hello how are you";
		System.out.println("Split function on string is: "+ str6.split(" "));
		String[] str7 = str6.split(" ");
		System.out.println(str7.length);
		for(int i = 0; i < str7.length; i++) {
			System.out.println(str7[i]);
		}
		
		String str8 = "Hello;How|are,you";
		System.out.println(str8.split(";|,"));
		//System.out.println(str6.spli)
		//System.out.println("Split function on string is: "+ str6.split(str6);
	}
}
