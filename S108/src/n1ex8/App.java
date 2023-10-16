package n1ex8;

public class App {

	public static void main(String[] args) {

		String str = "Hello World!";
		
		StringReverser sr = (String s) -> {
			String r = ""; 
			for (int i = s.length() -1; i>=0; --i) {
				r = r + (Character.toString(s.charAt(i)));
			}
			return r;
		};
		
		String r = sr.reverse(str);
		System.out.println(r);

	}

}
