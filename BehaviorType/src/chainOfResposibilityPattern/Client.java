package chainOfResposibilityPattern;

public class Client {

	public static void main(String[] args) {
		//��װ������
		Handler handler1=new ConcreteHandler();
		Handler handler2=new ConcreteHandler();
		Handler handler3=new ConcreteHandler();
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		//�ύ����
		handler1.handleRequest();
	}
}
