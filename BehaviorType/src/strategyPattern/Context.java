package strategyPattern;

public class Context {

	//����һ��������ԵĶ���
	private Strategy strategy;
	
	/**
	 * ���캯��������һ��������Զ���
	 * @param strategy  ������Զ���
	 */
	public Context(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
	}
	/**
	 * ���Է���
	 */
	public void contextInterface(){
		strategy.stargetyInterface();
	}
}