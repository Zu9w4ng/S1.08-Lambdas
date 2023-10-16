package n2ex1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>(Arrays.asList("David", "Ana", "Marc", "Ada", "Mar"));
	
		System.out.println(filter(names));

	}
	
	public static List<String> filter(List<String> list) {
		
		List<String> filteredList = new ArrayList<String>();
		
		list.forEach(e -> {
			if(e.length()==3 && e.charAt(0)=='A') {
				filteredList.add(e);
			}
		});
		return filteredList;
	}
}
