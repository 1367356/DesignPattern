package observerPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	/**
	 * 用来保存注册的观察者对象
	 */
	private List<Observe> list=new ArrayList<Observe>();
	/**
	 * 注册观察者对象
	 */
	public void attach(Observe observe){
		list.add(observe);
		System.out.println("Attached an observer");
	}
	/**
	 * 删除观察者对象
	 */
	public void detach(Observe observe){
		list.remove(observe);
		System.out.println("detach an observer");
	}
	/**
	 * 通知所有注册的观察者对象
	 */
	public void notifyObservers(String newState){
		for(Observe observe:list){
			observe.update(newState);
		}
	}
	
}
