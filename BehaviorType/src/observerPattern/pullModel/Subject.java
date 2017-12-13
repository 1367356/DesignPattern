package observerPattern.pullModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 拉模型的抽象主题类
 * @author admin
 *
 */
public abstract class Subject {

	/**
	 * 用来保存组成的 观察者对象
	 */
	private List<Observer> list=new ArrayList<Observer>();
	/**
	 * 注册观察者对象
	 * 
	 */
	public void attach(Observer observer){
		list.add(observer);
		System.out.println("Attached an observer");
	}
	/**
	 * 删除观察者对象
	 */
	public void detach(Observer observer){
		list.remove(observer);
		System.out.println("detach an observer");
	}
	/**
	 * 通知所有注册的观察者对象
	 */
	public void notifyObservers(){
		for(Observer observer:list){
			observer.update(this);
		}
	}
}
