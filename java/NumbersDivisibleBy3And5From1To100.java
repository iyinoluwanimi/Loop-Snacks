public class NumbersDivisibleBy3And5From1To100 {
public static void main (String [] args) {

	for (int index = 1;index <= 100; index++){
	
		if (index % 3 == 0 && index % 5 == 0 ) {
			System.out.println(index);
		}
	
	}	

    
}



}
