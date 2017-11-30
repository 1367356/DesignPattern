package abstractFactoryPattern;

public class AmdCpu implements Cpu{

	/**
	 * CPU的针脚数
	 */
	private int pins=0;
	public AmdCpu(int pins) {
		// TODO Auto-generated constructor stub
		this.pins=pins;
	}
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("AMD CPU的针脚数："+pins);
	}

}
