package visitorPattern.nodeVisitor;

/**
 *����ڵ���NodeB
 * @author admin
 *
 */
public class NodeB extends Node{

	/**
	 * ���ܷ���
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	/**
	 * NodeB���еķ���
	 * @return
	 */
	public String operation(){
		return "NodeB";
	}
}
