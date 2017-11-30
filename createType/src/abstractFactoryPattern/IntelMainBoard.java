package abstractFactoryPattern;

public class IntelMainBoard implements MainBoard{

	/**
	 * CPU插槽的孔数
	 */
	private int cpuHoles=0;
	public IntelMainBoard(int cpuHoles) {
		// TODO Auto-generated constructor stub
		this.cpuHoles=cpuHoles;
	}
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("Intel主板的cpu插槽孔数是"+cpuHoles);
	}

}
