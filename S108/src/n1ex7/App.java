package n1ex7;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		List<?> list = new ArrayList<>(Arrays.asList(3, "hola", "str", "collection", 7, 23, "Python"));
		List<String> orderedStrings = new ArrayList<String>();
		
		list.forEach(e -> { if(e.getClass() == "".getClass()) orderedStrings.add((String) e); } );
		Collections.sort(orderedStrings, (a,b) -> b.length() - a.length());
		
		System.out.println(orderedStrings);
	
		

	}

}