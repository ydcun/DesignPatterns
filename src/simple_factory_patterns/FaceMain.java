package simple_factory_patterns;

/**
 * 该类是模拟前台数据数据
 * @author ydcun
 */
public class FaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 123;
		int v2 = 0;
		char operator = '/';
		// 从工厂类中获取对应的运算对象
		Operation operation = Factory.getOperation(operator);
		operation.number1 = v1;
		operation.number2 = v2;
		double result = operation.getResult();
		System.out.println(result);
	}

}
