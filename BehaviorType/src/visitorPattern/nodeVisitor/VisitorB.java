package visitorPattern.nodeVisitor;

public class VisitorB implements Visitor{

	/**
	 * ��Ӧ��NodeA�ķ��ʲ���
	 */
	public void visit(NodeA node) {
		// TODO Auto-generated method stub
		System.out.println(node.operationA());
	}

	public void visit(NodeB node) {
		// TODO Auto-generated method stub
		System.out.println(node.operation());
	}

}