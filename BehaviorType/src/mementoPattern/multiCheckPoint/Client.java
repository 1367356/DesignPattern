package mementoPattern.multiCheckPoint;

public class Client {

	public static void main(String[] args) {
		Originator o=new Originator();
		Caretaker c=new Caretaker(o);
		
		//�ı�״̬
		o.setState("state 0");
		//����һ������
		c.createMemento();
		//�ı�״̬
		o.setState("state 1");
		//����һ������
		c.createMemento();
		//�ı�״̬
		o.setState("state 1");
		//����һ������
		c.createMemento();
		//�ı�״̬
		o.setState("state 2");
		//����һ������
		c.createMemento();
		//�ı�״̬
		o.setState("state 3");
		c.createMemento();
		o.printStates();
		System.out.println("-------------�ָ�����");
		
		//�ָ����ڶ�������
		c.restoreMemento(2);
		//��ӡ�����м���
		o.printStates();
	}
}
