package facadePattern.selectExposeMethod;

public class ModuleFacade {

	ModuleA a=new ModuleA();
	ModuleB b=new ModuleB();
	
	/**
	 * ������Щ��A,B,Cģ����������ⲿ�����ṩ�ķ���
	 */
	public void a1(){
		a.a1();
	}
	public void b1(){
		b.b1();
	}
}
