package abstractFactoryPattern;

public interface AbstractFactory {

	/**
	 * ����CPU����
	 */
	public Cpu createCpu(); 
	/**
	 * �����������
	 */
	public MainBoard cerateMainBoard();
}