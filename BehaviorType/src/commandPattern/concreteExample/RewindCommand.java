package commandPattern.concreteExample;

public class RewindCommand implements Command{

	private AudioPlayer audio;
	public RewindCommand(AudioPlayer audio) {
		// TODO Auto-generated constructor stub
		this.audio=audio;
	}
	public void execute() {
		// TODO Auto-generated method stub
		audio.rewind();
	}

}
