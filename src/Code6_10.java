import java.util.*;
public class Code6_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] heights = {172, 149, 152, 191, 155};
		
		// Java.utilパッケージのArrays.sortクラスを使用して並べ替え
		Arrays.sort(heights);
		
		for(int h : heights) {
			System.out.println(h);
		}
	}

}
