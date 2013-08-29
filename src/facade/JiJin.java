package facade;

/**
 * @author ydcun
 *基金;有他来买股票
 */
public class JiJin {
	private GpOne one =null;
	private GpTwo two =null;
	private GpThree three =null;
	public JiJin() {
		one = new GpOne();
		two = new GpTwo();
		three = new GpThree();
	}
	/**
	 * 购买基金
	 */
	public void buy(){
		one.buy();
		two.buy();
		three.buy();
	}
	/**
	 * 赎回基金
	 */
	public void shell(){
		one.shell();
		two.shell();
		three.shell();
	}
}
