package simple_factory_patterns;

/**
 * 根据标识符生产运算实体类
 * @author ydcun
 *
 */
public class Factory {

	public static Operation getOperation(char operator) {
		Operation operation=null;
		switch (operator) {
		case '+':
			operation = new OperationAdd();
			break;
		case '-':
			operation = new OperationSub();
			break;
		case '*':
			operation = new OperationMul();
			break;
		case '/':
			operation = new OperationDiv();
			break;
		}
		return operation;
	}

}
