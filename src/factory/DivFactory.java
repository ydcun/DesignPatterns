package factory;

/**
 * @author ydcun
 *除法工厂类
 */
public class DivFactory implements IFactory {

	public Operation CreateOperation() {
		return new OperationDiv();
	}

}
