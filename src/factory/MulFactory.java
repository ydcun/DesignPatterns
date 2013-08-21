package factory;

/**
 * @author ydcun
 *乘法工厂类
 */
public class MulFactory implements IFactory{

	public Operation CreateOperation() {
		
		return new OperationMul();
	}

}
