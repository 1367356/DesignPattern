package commandPattern.concreteExample;

/**
 * �ͻ���
 */
public class Client {

	public static void main(String[] args) {
		
		//���������߶���
		AudioPlayer audioPlayer=new AudioPlayer();
		
		//�����������
		Command playCommand=new PlayCommand(audioPlayer);
		Command rewindCommand=new RewindCommand(audioPlayer);
		Command stopCommand=new StopCommand(audioPlayer);
		
		//���������߶���
		Keypad keypad=new Keypad();
		keypad.setPlayCommand(playCommand);
		keypad.setRewindCommand(rewindCommand);
		keypad.setStopCommand(stopCommand);
		
		//����
		keypad.play();
		keypad.rewind();
		keypad.stop();
		keypad.play();
		keypad.stop();
	}
	
}
