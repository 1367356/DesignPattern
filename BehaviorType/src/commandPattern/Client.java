package commandPattern;

/**
 * �ͻ��˽�ɫ��
 * @author admin
 *
 */
public class Client {

	public static void main(String[] args) {
		//����������
		Receiver receiver=new Receiver();
		//������������趨���Ľ�����
		Command command=new ConcreteCommand(receiver);
		//���������ߣ�������������ý�ȥ
		Invoker invoker=new Invoker(command);
		
		//ִ�з���
		invoker.action();
	}
}
