package observerPattern.pullModel;

/**
 * ��ģ�͵ľ���۲�����
 * @author admin
 *
 */
public class ConcreteObserver implements Observer{

	//�۲��ߵ�״̬
	private String observerState;
	public void update(Subject subject) {
		// ���¹۲��ߵ�״̬��ʹ����Ŀ���״̬����һ��
		observerState=((ConcreteSubject)subject).getState();
		System.out.println("�۲���״̬Ϊ"+observerState);
	}

}
