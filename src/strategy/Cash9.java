package strategy;

/**
 * 打九折实现类
 * 
 * @author ydcun
 * 
 */
public class Cash9 extends CashSup {
	private int price;// 单价
	private int count;// 数量
	private double zhekou;

	/**
	 * @param price 商品价格
	 * @param count 购买数量
	 * @param zhekou 折扣0.1-1.0
	 */
	public Cash9(int price, int count,double zhekou) {
		this.count = count;
		this.price = price;
		this.zhekou = zhekou;
		if(zhekou<=0 || zhekou >1){
			this.zhekou = 1;
		}
	}

	@Override
	int getResult() {
		return (int) (price * count * zhekou);
	}

}
