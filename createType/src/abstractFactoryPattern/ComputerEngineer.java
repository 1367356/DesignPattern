package abstractFactoryPattern;

/**
 * 装机工程师类
 * @author admin
 *
 */
public class ComputerEngineer {
	
	/**
	 * 定义装机需要的 CPU和主板
	 * 用接口
	 */
	private Cpu cpu=null;
	private MainBoard mainBoard=null;
	
	public void makeComputer(int cpuType,int mainboard){
		/**
		 * 组装机器的基本步骤
		 */
		//1首先准备好装机所需要的配件
		prepareHadwares(cpuType,mainboard);
		//2组装机器
		//3测试机器
		//4交付客户
	}

	private void prepareHadwares(int cpuType, int mainboard2) {
		// TODO Auto-generated method stub
		this.cpu=CpuFactory.createCpu(cpuType);
		this.mainBoard=MainboardFactory.createMainBoard(mainboard2);
		
		this.cpu.calculate();
		this.mainBoard.installCPU();
	}
	
	
}
