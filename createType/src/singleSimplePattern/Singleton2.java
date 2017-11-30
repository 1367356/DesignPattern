package singleSimplePattern;

/**
 * 类级内部类，内部类添加上static就是类级内部类。
 * @author admin
 *
 */
public class Singleton2 {

	private Singleton2(){
		
	}
	private static class SingletonHolder{
		/**
		 * 静态初始化器，由JVM来保证线程安全,静态的，只会装载一次
		 */
		private static Singleton2 instance=new Singleton2();
	
	}
	public static Singleton2 getInstance(){
		
		return SingletonHolder.instance;
	}
}
