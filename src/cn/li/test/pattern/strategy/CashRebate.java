package cn.li.test.pattern.strategy;
/**
 * �����շ�
 * @author Administrator
 *
 */
public class CashRebate implements CashSuper {
	private double moneyRebate = 1d;
	public CashRebate(double moneyRebate){
		this.moneyRebate = moneyRebate;
	}
	
	@Override
	public double acceptCash(double money) {
		return money*moneyRebate;
	}

}
