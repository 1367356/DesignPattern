package commandPattern.concreteExample;

public class StopCommand implements Command{

	private AudioPlayer audio;
	public StopCommand(AudioPlayer audio) {
		// TODO Auto-generated constructor stub
		this.audio=audio;
	}
	public void execute() {
		// TODO Auto-generated method stub
		audio.stop();
	}

}
