package singleSimplePattern;

/**
 * �༶�ڲ��࣬�ڲ��������static�����༶�ڲ��ࡣ
 * @author admin
 *
 */
public class Singleton2 {

	private Singleton2(){
		
	}
	private static class SingletonHolder{
		/**
		 * ��̬��ʼ��������JVM����֤�̰߳�ȫ,��̬�ģ�ֻ��װ��һ��
		 */
		private static Singleton2 instance=new Singleton2();
	
	}
	public static Singleton2 getInstance(){
		
		return SingletonHolder.instance;
	}
}
