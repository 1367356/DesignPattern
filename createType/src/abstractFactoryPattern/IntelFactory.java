package abstractFactoryPattern;

public class IntelFactory implements AbstractFactory{

	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(755);
	}

	public MainBoard cerateMainBoard() {
		// TODO Auto-generated method stub
		return new IntelMainBoard(755);
	}

}
