package visitorPattern.nodeVisitor;

public class NodeA extends Node{

	public String operationA() {
		// TODO Auto-generated method stub
		return "NodeA";
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
