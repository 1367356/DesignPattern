package mementoPattern.whiteBoxImpl;

/**
 * �����˶�����
 * @author admin
 *
 */
public class Caretaker {

	private Memento memento;
	/**
	 * ����¼��ȡֵ����
	 */
	public Memento retrieveMemento(){
		return this.memento;
	}
	/**
	 * ����¼�ĸ��Ʒ���
	 */
	public void saveMemento(Memento memento){
		this.memento=memento;
	}
}
