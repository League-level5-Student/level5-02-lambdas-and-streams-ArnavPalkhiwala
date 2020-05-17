package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.

		printCustomMessage((s) -> {
			String backwards = "";
			for (int i = 0; i < s.length(); i++) {
				backwards += s.charAt(s.length() - i - 1);
			}
			System.out.println(backwards);
		}, "Print");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.

		printCustomMessage((s) -> {
			String mixedLetters = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					Character c = s.charAt(i);
					mixedLetters += c.toUpperCase(c);
				}

				else {
					Character c = s.charAt(i);
					mixedLetters += c.toLowerCase(c);

				}
			}
			System.out.println(mixedLetters);
		}, "String");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s)->{
			String newS = "";
			for (int i = 0; i < s.length(); i++) {
				newS += s.charAt(i);
				newS += ".";
			}
			System.out.println(newS);
		}, "String");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		
		printCustomMessage((s)->{
			String withoutVowels = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != 'i' || s.charAt(i) != 'I') {
					withoutVowels += s.charAt(i);
				}
				
			}	
			System.out.println(withoutVowels);

		}, "Strng");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
