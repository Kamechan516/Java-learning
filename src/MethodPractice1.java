import java.util.*;
public class MethodPractice1 {

	
	public static String stringScanner(String name) {
		String ans = name + "さん";
		return ans;
	}
	
	public static int intScanner(int input, int x) { 
		int int_ans = input + x;
		return int_ans;
	}
	
	public static double doubleScanner(double y, double shosu) {
		double double_ans = y + shosu;
		return double_ans;
	}
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		
		//メソッドstringScannerの処理
		System.out.println("名前を入力してくれい！！");
		String name = sc.nextLine();
		String ans = stringScanner(name);
		System.out.println("メソッド[stringScanner]の結果です。");
		System.out.println(ans);
		
		//メソッドintScannerの処理
		System.out.println("なんか適当な数字を入力してくれい（整数限定!!）");
		int input = sc.nextInt();
		int x = 1000;
		int int_ans = intScanner(input, x);
		System.out.println("メソッド[intScanner]の結果です。");
		System.out.println(int_ans);
		
		//メソッドdoubleScannerの処理
		System.out.println("なんか適当な数字を入力してくれい（小数限定!!）");
		double shosu = sc.nextDouble();
		double y = 15.5;
		double double_ans = doubleScanner(shosu, y);
		System.out.println("メソッド[doubleScanner]の結果です。");
		System.out.println(double_ans);		
	}

}
