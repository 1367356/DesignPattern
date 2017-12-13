package templateMethodPattern.concreteExample;

public class MoneyMarketAccount extends Account{

	@Override
	public String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "Money Market";
	}

	@Override
	public double doCalculateInterestRate() {
		// TODO Auto-generated method stub
		return 0.045;
	}

}
