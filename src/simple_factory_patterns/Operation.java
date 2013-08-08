package simple_factory_patterns;

/**
 * 这个是所有运算类的父类
 * @author ydcun
 *
 */
public abstract class Operation {
	protected int number1=0;
	protected int number2=0;
	abstract int getResult();
}
