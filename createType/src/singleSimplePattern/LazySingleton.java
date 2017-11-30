package singleSimplePattern;

/**
 * ����ʽ
 */
public class LazySingleton {

	private static LazySingleton instance=null;
	/**
	 * ˽��Ĭ�Ϲ��캯��
	 */
	private LazySingleton(){
		
	}
	/**
	 * ��̬��������
	 */
	public static synchronized LazySingleton getInstance(){
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
}
