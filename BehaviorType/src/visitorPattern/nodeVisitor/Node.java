package visitorPattern.nodeVisitor;

public abstract class Node {

	/**
	 * ���ܲ���
	 */
	public abstract void accept(Visitor visitor);
}
