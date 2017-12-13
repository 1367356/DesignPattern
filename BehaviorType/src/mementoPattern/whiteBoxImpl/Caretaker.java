package mementoPattern.whiteBoxImpl;

/**
 * 负责人对象类
 * @author admin
 *
 */
public class Caretaker {

	private Memento memento;
	/**
	 * 备忘录的取值方法
	 */
	public Memento retrieveMemento(){
		return this.memento;
	}
	/**
	 * 备忘录的复制方法
	 */
	public void saveMemento(Memento memento){
		this.memento=memento;
	}
}
