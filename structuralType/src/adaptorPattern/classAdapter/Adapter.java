package adaptorPattern.classAdapter;

/**
 * 类适配器模式
 * @author admin
 *
 */
public class Adapter extends Adaptee implements Target{

	/**
	 * 由于源类Adaptee没有sampleOperation2()
	 * 因此适配器补充这个方法
	 */
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		//写相关的代码
	}

}
