package strategy;

/**
 * 前段测试类
 * 
 * @author ydcun
 * 
 */
public class FaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 8;// 商品数量
		int price = 48;// 商品单价
		String[] temp = { "原价", "打九折", "打八折", "满300返100" };
		String stat = temp[3];
		CashContext cashCountext = null;
		if (stat.equals("打九折")) {
			cashCountext = new CashContext(new Cash9(price, count, 0.9));

		} else if (stat.equals("打八折")) {
			cashCountext = new CashContext(new Cash9(price, count, 0.8));
		} else if (stat.equals("满300返100")) {
			cashCountext = new CashContext(
					new Cash3to1(price, count, 300, 100));
		} else {
			cashCountext = new CashContext(new Cash9(price, count, 1));
		}
		System.out.println("单价：" + price + " 数量：" + count + "活动:" + stat
				+ " 原价 总价：" + cashCountext.getContextInterface());
	}

}
