package decorator;

public class Main {


	public static void main(String[] args) {
		
		Person p = new Person("ydcun");
		
		System.out.println("第一种装扮");
		Tshirts t = new Tshirts();
		ShortKu sk = new ShortKu();
		Guazi gz = new Guazi();
		
		t.Decorator(p);
		sk.Decorator(t);
		gz.Decorator(sk);
		gz.show();

		System.out.println("第二种装扮");
		Tshirts t2 = new Tshirts();
		ShortKu sk2 = new ShortKu();
		Guazi gz2 = new Guazi();
		 
		gz2.Decorator(p);
		sk2.Decorator(gz2);
		t2.Decorator(sk2);
		t2.show();
	}

}
