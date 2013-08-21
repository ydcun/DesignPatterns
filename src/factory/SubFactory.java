package factory;

/**
 * @author ydcun
 *加法工厂类
 */
public class SubFactory implements IFactory {

	public Operation CreateOperation() {
		return new OperationSub();
	}

}
