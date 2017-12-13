package facadePattern;

/**
 * 门面角色类
 * @author admin
 *
 */
public class Facade {

	//示意方法，满足客户端需要的功能
	public void test(){
		ModelA a=new ModelA();
		a.testA();
		ModuleB b=new ModuleB();
		b.testB();
		ModuleC c=new ModuleC();
		c.testC();
	}
}
