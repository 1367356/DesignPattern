package abstractFactoryPattern;

public class IntelMainBoard implements MainBoard{

	/**
	 * CPU��۵Ŀ���
	 */
	private int cpuHoles=0;
	public IntelMainBoard(int cpuHoles) {
		// TODO Auto-generated constructor stub
		this.cpuHoles=cpuHoles;
	}
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("Intel�����cpu��ۿ�����"+cpuHoles);
	}

}
