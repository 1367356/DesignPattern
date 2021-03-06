package abstractFactoryPattern;

public class ComputerEngineerAbstractFactory {

	/**
	 * 抽象工厂模式的需要的Cpu和主板
	 */
	private Cpu cpu;
	private MainBoard mainBoard;
	public void makeComputer(AbstractFactory af) {  //传递进去一个抽象工厂
		/**
		 * 组装机器的基本步骤
		 */
		//1 首先真被好装机所需要的配件
		prepareHardware(af);
		//2 ：组装机器
		//3：测试机器
		//4: 交付客户
	}
	private void prepareHardware(AbstractFactory af) {
		// TODO Auto-generated method stub
		this.cpu=af.createCpu();
		this.mainBoard=af.cerateMainBoard();
		
		//测试配件是否好用
		this.cpu.calculate();
		this.mainBoard.installCPU();
		
	}
}
