package visitorPattern.nodeVisitor;

public class VisitorA implements Visitor{

	/**
	 * 对应于NodeA的访问操作
	 */
	public void visit(NodeA node) {
		// TODO Auto-generated method stub
		System.out.println(node.operationA());
	}

	/**
	 * 对应于NodeB的访问操作
	 */
	public void visit(NodeB node) {
		// TODO Auto-generated method stub
		System.out.println(node.operation());
	}

}
