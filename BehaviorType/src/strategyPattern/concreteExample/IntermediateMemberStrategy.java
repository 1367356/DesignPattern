package strategyPattern.concreteExample;

public class IntermediateMemberStrategy implements MemberStrategy{

	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("中级会员折扣是10%");
		return booksPrice*0.9;
	}

}
