package proxyPattern;

/**
 * �������
 * @author admin
 *
 */
public class ProxyObject extends AbstractObject{

	RealObject realObject=new RealObject();
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		//����Ŀ�����֮ǰ��������ز���
		System.out.println("before");
		realObject.operation();
		//����Ŀ�����֮���������ز���
		System.out.println("after");
	}

}
