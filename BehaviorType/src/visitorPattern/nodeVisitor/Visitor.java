package visitorPattern.nodeVisitor;

public interface Visitor {

	/**
	 * ��Ӧ��NodeA�ķ��ʲ���
	 */
	public void visit(NodeA node);
	/**
	 * ��Ӧ��NodeB�ķ��ʲ���
	 */
	public void visit(NodeB node);
}