package abstractFactoryPattern;

import java.beans.Customizer;

public class IntelCpu implements Cpu{

	/**
	 * CPU�������
	 */
	private int pins=0;
	public IntelCpu(int pins){
		this.pins=pins;
	}
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Interl CPU���������"+pins);
	}

}
