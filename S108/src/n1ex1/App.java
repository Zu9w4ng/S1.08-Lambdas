package n1ex1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("David","Noelia","Clara","Juan","Oriol","María","Juanjo", "Olivia"));
		List<String> sublist = new ArrayList<String>();
		
		list.forEach(e -> {if(e.toLowerCase().contains("o")) sublist.add(e);});
		
		System.out.println(sublist);
	}
	

}
