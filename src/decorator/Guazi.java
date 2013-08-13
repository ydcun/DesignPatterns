package decorator;

public class Guazi extends Finery {

	@Override
	public void show() {
		System.out.print("褂子，");
		person.show();
	}

}
