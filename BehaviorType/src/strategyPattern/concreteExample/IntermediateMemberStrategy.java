package strategyPattern.concreteExample;

public class IntermediateMemberStrategy implements MemberStrategy{

	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("�м���Ա�ۿ���10%");
		return booksPrice*0.9;
	}

}
