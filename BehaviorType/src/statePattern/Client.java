package statePattern;

public class Client {

	public static void main(String[] args) {
		//����״̬
		State state=new ConcreteStateA();
		//��������
		Context context=new Context();
		//��״̬���õ�������
		context.setState(state);
		//����
		context.request("test");
	}
}
