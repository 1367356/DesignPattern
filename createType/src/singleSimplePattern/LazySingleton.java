package singleSimplePattern;

/**
 * 懒汉式
 */
public class LazySingleton {

	private static LazySingleton instance=null;
	/**
	 * 私有默认构造函数
	 */
	private LazySingleton(){
		
	}
	/**
	 * 静态工厂方法
	 */
	public static synchronized LazySingleton getInstance(){
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
}
