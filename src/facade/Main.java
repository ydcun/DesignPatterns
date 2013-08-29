package facade;

/**
 * @author ydcun
 *外观模式装饰类
 */
public class Main {
	public static void main(String[] args) {
		JiJin jiJin = new JiJin();
		jiJin.buy();
		jiJin.shell();
	}
}
