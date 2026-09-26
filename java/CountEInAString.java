import java.util.Scanner;
public class CountEInAString {
public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a word:");
	String userString = input.next();
	 int count = 0;
	for (int index = 0;index < userString.length();index++) {
	if (userString.charAt(index) == 'e'){
	count++;
	}
	  
}
	System.out.println(count);
}

}
