package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		boolean e = a > b;
		System.out.println(e);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean f = isSunny && isWarm;
		System.out.println(f);
		
		int x = 5;
		int y = 10;
		boolean g = (x >= 0) && (y % 2 ==0); 
		System.out.println(g);
		
		boolean hasPermission = false;
		boolean h = !(hasPermission);
		System.out.println(h);
		
	}

}
