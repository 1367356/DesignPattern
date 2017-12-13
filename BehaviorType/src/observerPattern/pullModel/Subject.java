package observerPattern.pullModel;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ģ�͵ĳ���������
 * @author admin
 *
 */
public abstract class Subject {

	/**
	 * ����������ɵ� �۲��߶���
	 */
	private List<Observer> list=new ArrayList<Observer>();
	/**
	 * ע��۲��߶���
	 * 
	 */
	public void attach(Observer observer){
		list.add(observer);
		System.out.println("Attached an observer");
	}
	/**
	 * ɾ���۲��߶���
	 */
	public void detach(Observer observer){
		list.remove(observer);
		System.out.println("detach an observer");
	}
	/**
	 * ֪ͨ����ע��Ĺ۲��߶���
	 */
	public void notifyObservers(){
		for(Observer observer:list){
			observer.update(this);
		}
	}
}
