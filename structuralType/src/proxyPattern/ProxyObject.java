package proxyPattern;

/**
 * 代理对象
 * @author admin
 *
 */
public class ProxyObject extends AbstractObject{

	RealObject realObject=new RealObject();
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		//调用目标对象之前可以做相关操作
		System.out.println("before");
		realObject.operation();
		//调用目标对象之后可以做相关操作
		System.out.println("after");
	}

}
