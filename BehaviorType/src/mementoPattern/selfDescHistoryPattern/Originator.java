package mementoPattern.selfDescHistoryPattern;

public class Originator {

	private String state;
	/**
	 * 改变状态
	 */
	public void changeState(String state){
		this.state=state;
		System.out.println("将状态改变为："+state);
	}
	/**
	 * 工厂方法：返回一个新的备忘录对象
	 */
	public Memento createMemento(){
		return new Memento(this);
	}
	
	/**
	 * 将发起人恢复到备忘录对象所记录的状态上
	 */
	public void restoreMemento(MementoIF memento){
		Memento m=(Memento)memento;
		changeState(m.state);
	}
	private class Memento implements MementoIF{

		private String state;
		//构造方法
		public Memento(Originator originator) {
			this.state=originator.state;
		}
		public String getState(){
			return state;
		}
		
	}
}
