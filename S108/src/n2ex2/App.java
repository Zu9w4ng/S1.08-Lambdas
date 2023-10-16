package n2ex2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<Integer>(Arrays.asList(3,53,42,71,60));
		System.out.println(listToString(numList));

	}
	
	public static String listToString(List<Integer> list) {

		StringBuilder sb = new StringBuilder();
		list.forEach(e -> {
			if(e%2==0)
				sb.append("e");
			else
				sb.append("o");
			sb.append(e);
			sb.append(", ");
		});
		int len = sb.length();
		if (len>0)
			sb.delete(len-2, len);
		
		return sb.toString();

	}

}
