package commandPattern.concreteExample;

public class PlayCommand implements Command{

	private AudioPlayer myaudio;
	public PlayCommand(AudioPlayer audio) {
		// TODO Auto-generated constructor stub
		this.myaudio=audio;
	}
	/**
	 * Ö´ÐÐ·½·¨
	 */
	public void execute() {
		// TODO Auto-generated method stub
		myaudio.play();
	}

}
