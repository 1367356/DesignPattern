package observerPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	/**
	 * ��������ע��Ĺ۲��߶���
	 */
	private List<Observe> list=new ArrayList<Observe>();
	/**
	 * ע��۲��߶���
	 */
	public void attach(Observe observe){
		list.add(observe);
		System.out.println("Attached an observer");
	}
	/**
	 * ɾ���۲��߶���
	 */
	public void detach(Observe observe){
		list.remove(observe);
		System.out.println("detach an observer");
	}
	/**
	 * ֪ͨ����ע��Ĺ۲��߶���
	 */
	public void notifyObservers(String newState){
		for(Observe observe:list){
			observe.update(newState);
		}
	}
	
}
