package n2ex3;

public class App {

	public static void main(String[] args) {
		
		Calculator calc = (a, b, o) -> {
			
			switch(o) {
				case '+':
					return a+b;
				case '-':
					return a-b;
				case '*':
					return a*b;
				case '/':
					if(b!=0)
						return a/b;
					throw new Exception("Cannot divide by zero");
				default:
					throw new Exception("Unknown operation type");
			}
		};
		
		try {
			System.out.println(calc.operation(3, 5, '+'));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(calc.operation(4, 7, '*'));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(calc.operation(23, 5, '/'));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(calc.operation(3, 5, 'a'));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(calc.operation(3, 0, '/'));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
