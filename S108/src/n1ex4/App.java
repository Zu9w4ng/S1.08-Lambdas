package n1ex4;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		List<String> months = new ArrayList<String>(Arrays.asList(
				"January", "February", "March", "April", "May", "June", "July", "August", 
				"September", "October", "November", "December"));
		
		months.forEach(System.out::println);
	}

}
