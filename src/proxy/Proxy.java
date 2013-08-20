package proxy;

/**
 * 代理类，实现抽象接口，从而决定代理的方法
 * 代理类中有一个真正类的对象属相在方法总其实是调用真实类的方法实现的
 * @author ydcun
 *
 */
public class Proxy implements Subject {
	
	private RealSubject ydcun;

	public Proxy(Person mm) {
		ydcun = new RealSubject(mm);
	}

	public void goFlower() {
		ydcun.goFlower();
	}

	public void goCoffee() {
		ydcun.goCoffee();
	}

}
