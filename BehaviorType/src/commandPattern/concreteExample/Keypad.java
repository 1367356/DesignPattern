package commandPattern.concreteExample;

public class Keypad {

	private Command playCommand;
	private Command rewindCommand;
	private Command stopCommand;
	public Command getPlayCommand() {
		return playCommand;
	}
	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}
	public Command getRewindCommand() {
		return rewindCommand;
	}
	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand = rewindCommand;
	}
	public Command getStopCommand() {
		return stopCommand;
	}
	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}
	
	/**
	 * ִ�в��ŷ���
	 */
		public void play(){
			playCommand.execute();
		}
		/**
		 * ִ�е�������
		 */
		public void rewind(){
			rewindCommand.execute();
		}
		/**
		 * ִ��ֹͣ����
		 */
		public void stop(){
			stopCommand.execute();
		}
		
		
}
