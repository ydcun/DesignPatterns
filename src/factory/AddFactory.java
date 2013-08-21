package factory;

/**
 * @author ydcun
 *加法工厂类
 */
public class AddFactory implements IFactory {

	public Operation CreateOperation() {
	
		return new OperationAdd();
	}

}
