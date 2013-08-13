package decorator;

public class ShortKu extends Finery {

	@Override
	public void show() {
		System.out.print("短裤，");
		person.show();
	}

}
