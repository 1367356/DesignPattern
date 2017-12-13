package commandPattern.concreteExample;

public class Client2 {

	public static void main(String[] args) {
		//创建接收者对象
		AudioPlayer audioPlayer=new AudioPlayer();
		
		//创建命令对象
		Command playCommand=new PlayCommand(audioPlayer);
		Command rewindCommand=new RewindCommand(audioPlayer);
		Command stopCommand=new StopCommand(audioPlayer);
		
		//向宏命令中添加命令
		MacroCommand macro=new MacroAudioCommand();
		macro.add(playCommand);
		macro.add(rewindCommand);
		macro.add(stopCommand);
		macro.execute();
	}
}
