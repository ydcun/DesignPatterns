package proxy;

/**
 * @author ydcun
 *测试类
 */
public class Main {
	
	public static void main(String[] args) {
		Person mm = new Person("琪琪");
		Proxy qiang = new Proxy(mm);
		qiang.goFlower();
		qiang.goCoffee();
	}
	
}
