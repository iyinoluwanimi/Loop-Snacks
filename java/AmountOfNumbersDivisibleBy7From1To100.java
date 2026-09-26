public class AmountOfNumbersDivisibleBy7From1To100 {
public static void main (String [] args) {
	int count = 0;
	for (int index = 1;index <= 100; index++){
	
		if (index % 7 == 0) {
			count++;
		}
	
	}	
	System.out.println(count);
    
}



}
