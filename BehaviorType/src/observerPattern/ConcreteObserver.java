package observerPattern;

public class ConcreteObserver implements Observe{

	//�۲���״̬
	private String observerState;
	public void update(String state) {
		// TODO Auto-generated method stub
		/**
		 * ���¹۲��ߵ�״̬��ʹ����Ŀ���״̬����һ��
		 */
		observerState=state;
		System.out.println("״̬Ϊ"+observerState);
	}

}
