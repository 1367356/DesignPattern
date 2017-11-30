package singleSimplePattern;

/**
 * 双重加锁的懒汉设计模式
 * @author admin
 *
 */
public class Singleton {

	private volatile static Singleton instance=null;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		//先检查实例是否存在，如果不存在才进入下面的同步块
		if(instance==null){
			//同步块
			synchronized (Singleton.class) {
				//再次检查实例是否存在，如果不存在才真正的创建实例
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
		
	}
}
