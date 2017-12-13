package templateMethodPattern.concreteExample;

public abstract class Account {

	/**
	 * ģ�巽����������Ϣ����
	 * @return   ������Ϣ����
	 */
	public final double calculateInterest(){
		double interestRate=doCalculateInterestRate();
		String accountType=doCalculateAccountType();
		double amount=calculateAmount(accountType);
		return amount*interestRate;
	}

	private double calculateAmount(String accountType) {
		// ʡ����ص�ҵ���߼�
		return 7423.00;
	}

	public abstract String doCalculateAccountType();

	public abstract double doCalculateInterestRate();
}
