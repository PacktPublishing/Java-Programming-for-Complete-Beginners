package Demo;

import java.util.StringTokenizer;
import java.util.Scanner;

public class UtilityPackageDemo2 {
	public static void main(String[] args) {
		// declaring and initializing variables here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence? ");
		String userString = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(userString, ";|,");
		//String[] st1 = userString.split(";|,");
		//System.out.println(st);
		
		// iterating over string tokenizer object
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			System.out.println("Processing word "+ word);
			
			// initilizing vowelCount variable here
			int vowelCount = 0;
			// vowel counting program logic here
			for(char c: word.toCharArray()) {
				c = Character.toLowerCase(c);
				if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				}
			}
			System.out.println("The vowel count for the word "+ word + " is: "+ vowelCount);
			
		}
	}

}
