package facadePattern.selectExposeMethod;

public class ModuleFacade {

	ModuleA a=new ModuleA();
	ModuleB b=new ModuleB();
	
	/**
	 * 下面这些是A,B,C模块对自胸膛外部调用提供的方法
	 */
	public void a1(){
		a.a1();
	}
	public void b1(){
		b.b1();
	}
}
