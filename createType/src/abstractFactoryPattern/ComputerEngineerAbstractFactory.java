package abstractFactoryPattern;

public class ComputerEngineerAbstractFactory {

	/**
	 * ���󹤳�ģʽ����Ҫ��Cpu������
	 */
	private Cpu cpu;
	private MainBoard mainBoard;
	public void makeComputer(AbstractFactory af) {  //���ݽ�ȥһ�����󹤳�
		/**
		 * ��װ�����Ļ�������
		 */
		//1 �����汻��װ������Ҫ�����
		prepareHardware(af);
		//2 ����װ����
		//3�����Ի���
		//4: �����ͻ�
	}
	private void prepareHardware(AbstractFactory af) {
		// TODO Auto-generated method stub
		this.cpu=af.createCpu();
		this.mainBoard=af.cerateMainBoard();
		
		//��������Ƿ����
		this.cpu.calculate();
		this.mainBoard.installCPU();
		
	}
}