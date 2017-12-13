package strategyPattern.concreteExample;

public class Price {

	//����һ������Ĳ��Զ���
	private MemberStrategy strategy;
	
	public Price(MemberStrategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
	}
	/**
	 * ����ͼ��ļ۸�
	 */
	public double quote(double booksPrice){
		return this.strategy.calcPrice(booksPrice);
	}
}
