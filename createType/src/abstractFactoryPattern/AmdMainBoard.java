package abstractFactoryPattern;

public class AmdMainBoard implements MainBoard{

	/**
	 * cpu插槽的孔数
	 */
	private int cpuHoles=0;
	public AmdMainBoard(int cpuHoles) {
		// TODO Auto-generated constructor stub
		this.cpuHoles=cpuHoles;
	}
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("AMD主板的插槽孔数为："+cpuHoles);
	}

}
