package mementoPattern.whiteBoxImpl;

public class Client {

	public static void main(String[] args) {
		Originator o=new Originator();
		Caretaker c=new Caretaker();
		//�ı为���˶����״̬
		o.setState("on");
		//��������¼���󣬲��������˶����״̬�洢����
		c.saveMemento(o.createMemento());
		//�޸ķ����˵�״̬
		o.setState("off");
		//�ָ������˶����״̬
		o.restoreMemento(c.retrieveMemento());
		
		System.out.println(o.getState());
	}
}
