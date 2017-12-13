package strategyPattern.concreteExample;

public class Price {

	//持有一个具体的策略对象
	private MemberStrategy strategy;
	
	public Price(MemberStrategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
	}
	/**
	 * 计算图书的价格
	 */
	public double quote(double booksPrice){
		return this.strategy.calcPrice(booksPrice);
	}
}
