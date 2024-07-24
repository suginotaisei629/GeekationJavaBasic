package basicSyntax;

public class MethodPractice {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
        return a * b;
	}
	
	public static int divide(int a, int b) {
		if (b == 0) {
			 System.out.println("Error");
			 return 0;
		}
		return a / b;
	}
	
	public static void print(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result1 = add(a,b);
		print(result1);
		
		int result2 = subtract(a,b);
		print(result2);
		
		int result3 = multiply(a,b);
		print(result3);
		
		int result4 = divide(a,b);
		print(result4);
		
	    }
	}
