package simple_factory_patterns;

/**
 * 除非实现类
 * 
 * @author ydcun
 * 
 */
public class OperationDiv extends Operation  {

	public int getResult() {
		int temp = 0;
		try {
			temp = this.number1 / this.number2;
		} catch (ArithmeticException e) {
			System.out.print("除数不能为零");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
}
