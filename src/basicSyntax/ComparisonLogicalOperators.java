package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		boolean A = a > b;
		System.out.println(A);
		
		boolean isSunny = true;
	    boolean isWarm = true;
		boolean B = isSunny && isWarm;
		System.out.println(B);
		
		int x = 5;
		int y = 10;
		boolean C = (x >= 0) && (y % 2 ==0); 
		System.out.println(C);
		
		boolean hasPermission = false;
		boolean D = !(hasPermission);
		System.out.println(D);
		
	}

}
