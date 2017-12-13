package decoratorPattern;

public class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public void sampleOperation(){
		super.sampleOperation();
		//写相关的业务代码
	}
}
