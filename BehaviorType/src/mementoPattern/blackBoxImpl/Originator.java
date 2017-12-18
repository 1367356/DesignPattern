package mementoPattern.blackBoxImpl;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("��ֵ״̬��"+state);
	}
	/*
	 * ��������������һ���µı���¼����
	 */
	public MementoIF createMemento(){
		return new Memento(state);
	}
	

	/**
	 * ��������������һ���µı���¼����
	 */
	public void restoreMemento(MementoIF memento){
		this.setState(((Memento)memento).getstate());
	}
	
	private class Memento implements MementoIF{

		private String state;
		private Memento(String state) {
			// TODO Auto-generated constructor stub
			this.state=state;
		}
		private String getstate() {
			// TODO Auto-generated method stub
			return state;
		}
		private void setState(String state){
			this.state=state;
		}
		
	}
	
}