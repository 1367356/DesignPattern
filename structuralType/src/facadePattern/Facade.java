package facadePattern;

/**
 * �����ɫ��
 * @author admin
 *
 */
public class Facade {

	//ʾ�ⷽ��������ͻ�����Ҫ�Ĺ���
	public void test(){
		ModelA a=new ModelA();
		a.testA();
		ModuleB b=new ModuleB();
		b.testB();
		ModuleC c=new ModuleC();
		c.testC();
	}
}
