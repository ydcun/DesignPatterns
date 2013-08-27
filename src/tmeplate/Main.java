package tmeplate;

/**
 * @author ydcun
 * 测试类
 */
public class Main {
	public static void main(String[] args) {
		TestPaper paperA = new StudentA();
		TestPaper paperB = new StudentB();
		

		paperA.answer1();
		paperA.answer2();
		paperA.answer3();
		
		paperB.answer1();
		paperB.answer2();
		paperB.answer3();
	}

}
