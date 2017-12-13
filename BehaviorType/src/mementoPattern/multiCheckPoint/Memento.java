package mementoPattern.multiCheckPoint;

import java.util.ArrayList;
import java.util.List;

public class Memento {

	private List<String> states;
	private int index;
	public Memento(List<String> states, int index) {
		// TODO Auto-generated constructor stub
		this.states=new ArrayList<String>(states);
		this.index=index;
	}

	public List<String> getStates() {
		// TODO Auto-generated method stub
		return states;
	}

	public int getIndex() {
		// TODO Auto-generated method stub
		return index;
	}

}
