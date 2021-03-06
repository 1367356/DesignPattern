package templateMethodPattern.concreteExample;

public abstract class Account {

	/**
	 * 模板方法，计算利息数额
	 * @return   返回利息数额
	 */
	public final double calculateInterest(){
		double interestRate=doCalculateInterestRate();
		String accountType=doCalculateAccountType();
		double amount=calculateAmount(accountType);
		return amount*interestRate;
	}

	private double calculateAmount(String accountType) {
		// 省略相关的业务逻辑
		return 7423.00;
	}

	public abstract String doCalculateAccountType();

	public abstract double doCalculateInterestRate();
}
