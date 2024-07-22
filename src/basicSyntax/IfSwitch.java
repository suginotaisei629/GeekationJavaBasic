package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {
		int num = 4;
		if (num % 2 == 0) {
			System.out.println("2の倍数です。");
		}	
		num = 6;
		if (num % 3 == 0) {
			System.out.println("3の倍数です。");
		}
        
		num = 7;
		if (num % 2 == 0) {
	        System.out.println("2の倍数です");
	     } else if (num % 3 == 0) {
	        System.out.println("3の倍数です");
	     } else {
	        System.out.println("どちらでもありません。");
	     }
		
		String pref = "北海";
		switch (pref) {
		case "北海":
			System.out.println("北海道");
			break;
		}
		
	    pref = "東京";
		switch(pref) {
		case "東京":
			System.out.println("東京都");
			break;
		}
		
		pref = "京都";
		switch(pref) {
		case "京都":
			System.out.println("京都府");
			break;
		}
		
		switch (pref) {
		default:
			System.out.println("当てはまりません。");
			break;
		}
	}
}


