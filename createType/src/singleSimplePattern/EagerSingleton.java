package singleSimplePattern;

/**
 * 饿汉式单例模式
 * @author admin
 *
 */
public class EagerSingleton {

	private static EagerSingleton instance=new EagerSingleton();
	
	/**
	 * 私有默认构造子
	 */
	private EagerSingleton(){
	}
	/**
	 * 静态工厂方法
	 */
	public static EagerSingleton getInstance(){
		return instance;
	}
	
}
