import java.util.Scanner;
public class PrintCharactersInString {
public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a String:");
	String userString = input.next();
	 
	for (int index = 0;index < userString.length();index++) {
	System.out.println(userString.charAt(index));
	  
}
}

}
