package singleSimplePattern;

/**
 * 使用枚举类来实现单例模式，枚举类中只有一个元素
 * @author admin
 *
 */
public enum Singleton3 {

	/**
	 * 定义一个枚举的元素，它就代表了Singleton3的一个实例
	 */
	uniqueInstance;
	
	/**
	 * 单例可以有自己的操作
	 */
	public void singletonOperation(){
		//功能处理
	}
	
}
