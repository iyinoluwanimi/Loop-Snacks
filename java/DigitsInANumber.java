import java.util.Scanner;
public class DigitsInANumber {
public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter any Integer:");
	int integer = input.nextInt();
	
	int count = 0;
	
	do{
	integer = integer / 10;
	
	count = count + 1;   
	}while(integer != 0);
	
	
	System.out.println(count);  	

}

}
