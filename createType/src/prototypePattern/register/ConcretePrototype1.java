package prototypePattern.register;

public class ConcretePrototype1 implements Prototype{

	private String name;

	public Prototype clonePrototype() {
		ConcretePrototype1 cp1=new ConcretePrototype1();
		cp1.setName(this.name);
		// TODO Auto-generated method stub
		return cp1;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Now in prototype1,name="+this.name;
	}

}
