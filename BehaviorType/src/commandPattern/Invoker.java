package commandPattern;

/**
 * ������
 */
public class Invoker {

	/**
	 * �����������
	 */
	private Command command=null;
	/**
	 * ���췽��
	 */
	public Invoker(Command command){
		this.command=command;
	}
	
	/**
	 * �ж�����
	 */
	public void action(){
		command.execute();
	}
}
