package abstractFactoryPattern;

/**
 * 参考：http://www.cnblogs.com/java-my-life/archive/2012/03/28/2418836.html
 *       http://www.cnblogs.com/foryang/p/5849402.html
 * @author admin
 *
 */
public class ClientAbstractFactroy {

	public static void main(String[] args) {
		/**
		 * 创建装机工程师对象
		 */
		ComputerEngineerAbstractFactory ceaf=new ComputerEngineerAbstractFactory();
		//客户选择并创建需要使用的 产品对象
		AbstractFactory af=new IntelFactory();
		
		//告诉装机工程师自己选择的产品，让装机工程师组装电脑
		ceaf.makeComputer(af);
	
	}
}
