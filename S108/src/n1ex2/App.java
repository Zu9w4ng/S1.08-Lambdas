package n1ex2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("David","Noelia","Clara","Juan","Oriol","María","Juanjo", "Olivia", "Andrea"));
		List<String> sublist = new ArrayList<String>();
		
		list.forEach(e -> {
			if(e.toLowerCase().contains("o") || e.length() > 5) sublist.add(e);});
		
		System.out.println(sublist);
	}
	

}
