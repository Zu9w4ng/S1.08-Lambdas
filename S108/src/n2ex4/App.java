package n2ex4;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>(Arrays.asList(27, "hello", "world", 7, "java", 34, "google"));

		System.out.println(sortByFirst(list));
		System.out.println(sortByE(list));
		System.out.println(replaceA(list));
		System.out.println(onlyNum(list));
	}
	
	public static List<Object> sortByFirst(List<Object> list) {

		Collections.sort(list, (a, b) -> {
			return a.toString().charAt(0) - b.toString().charAt(0);}
		);
		return list;
		
	}
	
	public static List<Object> sortByE(List<Object> list) {

		Collections.sort(list, (a, b) -> {
			boolean a_contains_e = a.toString().contains("e");
			if (a_contains_e)
				return -1;
			return 1;
			}
		);
		return list;
		
	}
	
	public static List<Object> replaceA(List<Object> list) {
			List<Object> newList = new ArrayList<Object>();
			list.forEach(e -> {
				if (e.getClass()=="".getClass()) 
					newList.add(((String) e).replace("a", "4"));
				else
					newList.add(e);
			});
			return newList;
	}
	
	public static List<Object> onlyNum(List<Object> list) {
		List<Object> newList = new ArrayList<Object>();
		list.forEach(e -> {
			if (e.getClass()!="".getClass()) 
				newList.add(e);
		});
		return newList;
}

}
