package singleSimplePattern;

/**
 * ����ʽ����ģʽ
 * @author admin
 *
 */
public class EagerSingleton {

	private static EagerSingleton instance=new EagerSingleton();
	
	/**
	 * ˽��Ĭ�Ϲ�����
	 */
	private EagerSingleton(){
	}
	/**
	 * ��̬��������
	 */
	public static EagerSingleton getInstance(){
		return instance;
	}
	
}
