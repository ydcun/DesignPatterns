package strategy;

/**
 * 策略类的实现
 * @author ydcun
 *
 */
public class CashContext {
	private CashSup cashSup;
	
	public CashContext(CashSup cashSup) {
		this.cashSup = cashSup;
	}

	public int getContextInterface() {
		//这个方法看上去是多余的但是，我们有可能会在这个方法中进行其他操作来辅助下面方法的
		return cashSup.getResult();
	}
	
	
}
