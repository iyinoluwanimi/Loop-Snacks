import java.util.Scanner;

public class NumberOfVowelsInAString {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String userString = input.next();
		
		int count = 0;
		
		for (int index = 0; index < userString.length(); index++) {
		
			
			if ((userString.charAt(index) == 'a' )|| (userString.charAt(index) == 'e')|| (userString.charAt(index) == 'e')||(userString.charAt(index) == 'i')|| (userString.charAt(index) == 'o')||(userString.charAt(index) == 'u') || (userString.charAt(index) == 'A') || (userString.charAt(index) =='E')|| (userString.charAt(index) == 'I')|| (userString.charAt(index) == 'O')|| (userString.charAt(index) == 'U')){
			count = count + 1;
			}
		}
		System.out.println(count);
	}

}
