
public class Code5_3 {

	public static void  methodA() {
		System.out.println("methodA");
		methodC();
		methodB();
	}
	
	public static void methodB() {
		System.out.println("methodB");
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		methodA();
	}
	
	
	public static void methodC() {
		System.out.println("methodC");
	}

}
