package strategyPattern.concreteExample;

public class PrimaryMemberStrategy implements MemberStrategy{

	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("���ڳ�����Աû���ۿ�");
		return booksPrice;
	}

}
