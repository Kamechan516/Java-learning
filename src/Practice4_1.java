import java.util.*; 
public class Practice4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//各種配列の宣言
		String[] Value = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] Mark = {"♠","♦","♥","♣"};
		String[][] Trump = new String[4][13];
		
		//二次元配列へ格納
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				Trump[i][j] = Mark[i] + Value[j];
			}
		}
		
		System.out.println("どのマークのカードを表示しますか？ ♠:1,♦:2,♥:3,♣:4");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input) {
		case 1:
			for(int j = 0; j <13; j++) {
				System.out.print(" " + Trump[0][j] + " ");
		
			}
			break;
			
		case 2:
			for(int j = 0; j < 13; j++) {
				System.out.print(" " + Trump[1][j] + " ");
			}
			break;
			
		case 3:
			for(int j = 0; j < 13; j++) {
				System.out.print(" " + Trump[2][j] + " ");
			}
			break;
		
		case 4:
			for(int j = 0; j < 13; j++) {
				System.out.print(" " + Trump[3][j] + " ");
			}
			break;
		}
	}
}

