package strategyPattern.concreteExample;

public class PrimaryMemberStrategy implements MemberStrategy{

	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("对于初级会员没有折扣");
		return booksPrice;
	}

}
