package abstractFactoryPattern;

public class AmdMainBoard implements MainBoard{

	/**
	 * cpu��۵Ŀ���
	 */
	private int cpuHoles=0;
	public AmdMainBoard(int cpuHoles) {
		// TODO Auto-generated constructor stub
		this.cpuHoles=cpuHoles;
	}
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("AMD����Ĳ�ۿ���Ϊ��"+cpuHoles);
	}

}