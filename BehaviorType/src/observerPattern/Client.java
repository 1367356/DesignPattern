package observerPattern;

public class Client {

	public static void main(String[] args) {
		//�����������
		ConcreteSubject subject=new ConcreteSubject();
		//�����۲��߶���
		Observe observe=new ConcreteObserver();
		//���۲��߶���Ǽǵ����������
		subject.attach(observe);
		//�ı���������״̬
		subject.change("new state");
	}
}