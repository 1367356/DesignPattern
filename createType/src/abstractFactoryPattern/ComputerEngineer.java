package abstractFactoryPattern;

/**
 * װ������ʦ��
 * @author admin
 *
 */
public class ComputerEngineer {
	
	/**
	 * ����װ����Ҫ�� CPU������
	 * �ýӿ�
	 */
	private Cpu cpu=null;
	private MainBoard mainBoard=null;
	
	public void makeComputer(int cpuType,int mainboard){
		/**
		 * ��װ�����Ļ�������
		 */
		//1����׼����װ������Ҫ�����
		prepareHadwares(cpuType,mainboard);
		//2��װ����
		//3���Ի���
		//4�����ͻ�
	}

	private void prepareHadwares(int cpuType, int mainboard2) {
		// TODO Auto-generated method stub
		this.cpu=CpuFactory.createCpu(cpuType);
		this.mainBoard=MainboardFactory.createMainBoard(mainboard2);
		
		this.cpu.calculate();
		this.mainBoard.installCPU();
	}
	
	
}