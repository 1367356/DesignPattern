package commandPattern.concreteExample;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand{

	
	private List<Command> commandList=new ArrayList<Command>();
	public void execute() {
		// TODO Auto-generated method stub
		for (Command cmd : commandList) {
			cmd.execute();
		}
	}

	/**
	 * ������ۼ�������
	 */
	public void add(Command cmd) {
		// TODO Auto-generated method stub
		commandList.add(cmd);
	}

	/**
	 * ������ۼ�������
	 */
	public void remove(Command cmd) {
		// TODO Auto-generated method stub
		commandList.remove(cmd);
	}

}
