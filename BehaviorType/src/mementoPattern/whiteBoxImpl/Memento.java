package mementoPattern.whiteBoxImpl;

public class Memento {

	private String state;
	public Memento(String state) {
		// TODO Auto-generated constructor stub
		this.state=state;
	}

	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}
	public void setState(String state){
		this.state=state;
	}

}
