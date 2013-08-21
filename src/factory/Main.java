package factory;

/**
 * @author ydcun 测试类
 */
public class Main {
	public static void main(String[] args) {
		IFactory iFactory = new AddFactory();//创建对应的工厂
		//在工厂中创建出所需的真实运算类
		Operation operation = iFactory.CreateOperation();
		operation.number1 = 4;
		operation.number2 = 6;
		int reault = operation.getResult();
		System.out.println(reault);
	}
}
