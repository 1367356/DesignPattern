package commandPattern;

/**
 * ���������ɫ
 */
public class ConcreteCommand implements Command{

	//������Ӧ�� �����߶���
	private Receiver receiver;
	
	/**
	 * ���췽��
	 */
	public ConcreteCommand(Receiver receiver) {
		this.receiver=receiver;
	}
	public void execute() {
		//ͨ����ת�������߶������Ӧ�������ý�����������ִ�й���
		receiver.action();
	}

}