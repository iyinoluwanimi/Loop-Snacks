import java.util.Scanner;
public class LowerToUppercase {
public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a word:");
	String userString = input.next();
	 
	for (int index = 0;index < userString.length();index++) {
	char letter = userString.charAt(index);
	if ( letter >= 'a'&& letter <= 'z'){
		letter = (char) (letter - 32);
	}
	
		System.out.print(letter);  
}

}

}
