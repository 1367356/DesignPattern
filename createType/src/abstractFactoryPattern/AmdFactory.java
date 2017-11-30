package abstractFactoryPattern;

public class AmdFactory implements AbstractFactory{

	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu(938);
	}

	public MainBoard cerateMainBoard() {
		// TODO Auto-generated method stub
		return new AmdMainBoard(938);
	}

}
