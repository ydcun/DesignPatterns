package proxy;

/**
 * 通过接口真正的实现要被代理的方法
 * 
 * @author ydcun
 *
 */
public class RealSubject implements Subject {
	private Person mm;
	public RealSubject(Person mm) {
		this.mm = mm;
	}
	public void goFlower() {
		System.out.println("给"+mm.getName()+"送花");
	}

	public void goCoffee() {
		System.out.println("给"+mm.getName()+"送咖啡");
	}

}
