package n1ex5;

public class App {

	public static void main(String[] args) {
		
		Pi piGenerator = () -> 3.1415;
		
		System.out.println(piGenerator.getPiValue());
	}

}
