package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式：将对象组合成树形结构以表示‘部分-整体’的层次结构
 * @author admin
 *
 */
public class ComponentDemo {
	
	public abstract class Component{
		String name;
		public abstract void add(Component c);
		public abstract void remove(Component c);
		public abstract void eachChild();
	}
	
	//组合部件类
	public class Leaf extends Component{

		//叶子节点不具备添加的能力，所以不实现
		public void add(Component c) {
			// TODO Auto-generated method stub
			System.out.println("");
		}

		//叶子节点不具备添加的能力，必然也不能删除
		public void remove(Component c) {
			// TODO Auto-generated method stub
			System.out.println("");
		}

		//叶子节点没有子节点，所以显示自己的执行结果
		public void eachChild() {
			// TODO Auto-generated method stub
			System.out.println(name+"执行了");
		}
		
	}
	
	//组合类
	public class Composite extends Component{
		//用来保存节点的字节点
		List<Component> list=new ArrayList();

		//添加节点，添加部件
		public void add(Component c) {
			// TODO Auto-generated method stub
			list.add(c);
		}

		//删除节点，删除部件
		public void remove(Component c) {
			// TODO Auto-generated method stub
			list.remove(c);
		}

		public void eachChild() {
			// TODO Auto-generated method stub
			System.out.println(name+"执行了");
			for(Component c:list){
				c.eachChild();
			}
		}
		
	}
	public static void main(String[] args) {
		ComponentDemo demo=new ComponentDemo();
		
		//构造根节点
		Composite rootComposite=demo.new Composite();
		
		rootComposite.name="根节点";
		
		//左节点
		Composite compositeLeft=demo.new Composite();
		compositeLeft.name="左节点";
		
		//构建右节点，添加两个叶子节点，也就是子部件
		Composite compositeRight=demo.new Composite();
		compositeRight.name="右节点";
		Leaf leaf1=demo.new Leaf();
		leaf1.name="右-子节点1";
		Leaf leaf2=demo.new Leaf();
		leaf2.name="右-子节点2";
		compositeRight.add(leaf1);
		compositeRight.add(leaf2);
	}
	
}
