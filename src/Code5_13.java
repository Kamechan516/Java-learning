
public class Code5_13 {

	public static void incArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = {1, 2, 3};
		//メソッド実行前に一度出力
		System.out.println("メソッド実行前");
		for(int i : array) {
			System.out.println(i);
		}
		System.out.println();
		

		
		incArray(array);
		
		//メソッド実行後
		System.out.println("メソッド実行後");
		for(int i : array) {
			System.out.println(i);
		}
	}

}
