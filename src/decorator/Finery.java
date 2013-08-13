package decorator;

public abstract class Finery extends Person{

	protected Person person;
	
	public void Decorator(Person person) {
		this.person = person;
	}
	public abstract void show();
	
}
