package commandPattern;

/**
 * 具体命令角色
 */
public class ConcreteCommand implements Command{

	//持有相应的 接收者对象
	private Receiver receiver;
	
	/**
	 * 构造方法
	 */
	public ConcreteCommand(Receiver receiver) {
		this.receiver=receiver;
	}
	public void execute() {
		//通常会转调接收者对象的相应方法，让接收者来真正执行功能
		receiver.action();
	}

}
