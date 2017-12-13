package visitorPattern.nodeVisitor;

/**
 *具体节点类NodeB
 * @author admin
 *
 */
public class NodeB extends Node{

	/**
	 * 接受方法
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	/**
	 * NodeB特有的方法
	 * @return
	 */
	public String operation(){
		return "NodeB";
	}
}
