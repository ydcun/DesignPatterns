package decorator;

public class Tshirts extends Finery {

	@Override
	public void show() {
		System.out.print("大T恤，");
		person.show();
	}
}
