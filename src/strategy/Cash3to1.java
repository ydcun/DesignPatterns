package strategy;

/**
 * 满m返n：如满300返100
 * @author ydcun
 *
 */
public class Cash3to1 extends CashSup {
	private int price;
	private int count;
	private int m;//上限
	private int n;//返利
	
	/**
	 * @param price 商品单价
	 * @param count	够吗数量
	 * @param m	满多少
	 * @param n	返利多少
	 */
	public Cash3to1(int price,int count,int m,int n) {
		this.price = price;
		this.count = count;
		this.m = m;
		this.n = n;
	}
	@Override
	int getResult() {
		int sumPrice = price * count;
		if(sumPrice>m){
			return sumPrice-n;
		}else{
			return sumPrice;
		}
	}

}
