package templateMethodPattern;

public abstract class AbstractTemplate {

	/**
	 * ģ�巽��
	 */
	public void templateMethod(){
		//���û�������
	}
	/**
	 * ����������������������ʵ�֣�
	 */
	protected abstract void abstractMethod();
	/**
	 * �����������շ�����
	 */
	protected void hookMethod(){}
	/**
	 * �����������Ѿ�ʵ�֣�
	 */
	private final void concreteMethod(){
		//ҵ����صĴ���
	}
}