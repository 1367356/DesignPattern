package facadePattern.selectExposeMethod;

/**
 * 有选择性的给外部暴露方法
 * @author admin
 *
 */
public class ModuleA {

	/**
	 * 提供给子系统外部使用的方法
	 */
	public void a1(){
		System.out.println("modulea");
	}
	
	/**
	 * 子系统内部模块之间相互调用 的方法
	 */
	private void a2(){
		
	}
	private void a3(){
		
	}
}
