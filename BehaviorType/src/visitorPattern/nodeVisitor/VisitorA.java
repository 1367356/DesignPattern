package visitorPattern.nodeVisitor;

public class VisitorA implements Visitor{

	/**
	 * ��Ӧ��NodeA�ķ��ʲ���
	 */
	public void visit(NodeA node) {
		// TODO Auto-generated method stub
		System.out.println(node.operationA());
	}

	/**
	 * ��Ӧ��NodeB�ķ��ʲ���
	 */
	public void visit(NodeB node) {
		// TODO Auto-generated method stub
		System.out.println(node.operation());
	}

}
