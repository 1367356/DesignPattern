package proxyPattern;

/**
 * �ͻ���
 * @author admin
 *
 */
public class Client {

	public static void main(String[] args) {
		AbstractObject obj=new ProxyObject();
		obj.operation();
	}
}