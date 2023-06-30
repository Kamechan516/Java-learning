package main;
//import logic.CalcLogic;

public class Calc {
	
	//mainメソッド
	public static void main(String[] args) {
		//各種変数の生成
		int a = 10; int b  = 2;
		int total = logic.CalcLogic.tasu(a, b);
		int delta = logic.CalcLogic.hiku(a, b);
		
		//出力
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
	