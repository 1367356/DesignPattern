package prototypePattern.register;

public class ConcretePrototype2 implements Prototype{

	private String name;
	public Prototype clonePrototype() {
		// TODO Auto-generated method stub
		ConcretePrototype2 cp2=new ConcretePrototype2();
		cp2.setName(name);
		return null;
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
		return "Now in Prototype2,name="+this.name;
	}

}
