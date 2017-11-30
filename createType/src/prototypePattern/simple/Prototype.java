package prototypePattern.simple;

/**
 * 简单原型：http://www.cnblogs.com/java-my-life/archive/2012/04/11/2439387.html
 * @author admin
 *
 */
public interface Prototype {

	/**
	 * 克隆自身的方法
	 * @return 一个从自身克隆出来的对象
	 */
	public Object clonePrototype();
	
}
