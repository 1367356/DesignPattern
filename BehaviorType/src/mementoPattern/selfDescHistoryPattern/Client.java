package mementoPattern.selfDescHistoryPattern;

public class Client {

	public static void main(String[] args) {
		Originator o=new Originator();
		//�޸�״̬
		o.changeState("state 0");
		//��������¼
		MementoIF memento=o.createMemento();
		//�޸�״̬
		o.changeState("state 1");
		//��װ����¼�ָ������״̬
		o.restoreMemento(memento);
	}
}
