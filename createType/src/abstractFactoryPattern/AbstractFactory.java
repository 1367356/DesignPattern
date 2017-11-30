package abstractFactoryPattern;

public interface AbstractFactory {

	/**
	 * 创建CPU对象
	 */
	public Cpu createCpu(); 
	/**
	 * 创建主板对象
	 */
	public MainBoard cerateMainBoard();
}
