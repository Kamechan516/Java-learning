package FirstTermPractice;
import java.util.*;

public class Pass6_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		double a = rnd.nextDouble();
		
		double p_d = 6 * a + 1;
		
		int p = (int)p_d;
		
		System.out.println("サイコロの目数=" + p);
	}

}
