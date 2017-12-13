package commandPattern.concreteExample;

public class Client2 {

	public static void main(String[] args) {
		//���������߶���
		AudioPlayer audioPlayer=new AudioPlayer();
		
		//�����������
		Command playCommand=new PlayCommand(audioPlayer);
		Command rewindCommand=new RewindCommand(audioPlayer);
		Command stopCommand=new StopCommand(audioPlayer);
		
		//����������������
		MacroCommand macro=new MacroAudioCommand();
		macro.add(playCommand);
		macro.add(rewindCommand);
		macro.add(stopCommand);
		macro.execute();
	}
}
