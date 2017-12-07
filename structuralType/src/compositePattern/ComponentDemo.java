package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ģʽ����������ϳ����νṹ�Ա�ʾ������-���塯�Ĳ�νṹ
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
	
	//��ϲ�����
	public class Leaf extends Component{

		//Ҷ�ӽڵ㲻�߱����ӵ����������Բ�ʵ��
		public void add(Component c) {
			// TODO Auto-generated method stub
			System.out.println("");
		}

		//Ҷ�ӽڵ㲻�߱����ӵ���������ȻҲ����ɾ��
		public void remove(Component c) {
			// TODO Auto-generated method stub
			System.out.println("");
		}

		//Ҷ�ӽڵ�û���ӽڵ㣬������ʾ�Լ���ִ�н��
		public void eachChild() {
			// TODO Auto-generated method stub
			System.out.println(name+"ִ����");
		}
		
	}
	
	//�����
	public class Composite extends Component{
		//��������ڵ���ֽڵ�
		List<Component> list=new ArrayList();

		//���ӽڵ㣬���Ӳ���
		public void add(Component c) {
			// TODO Auto-generated method stub
			list.add(c);
		}

		//ɾ���ڵ㣬ɾ������
		public void remove(Component c) {
			// TODO Auto-generated method stub
			list.remove(c);
		}

		public void eachChild() {
			// TODO Auto-generated method stub
			System.out.println(name+"ִ����");
			for(Component c:list){
				c.eachChild();
			}
		}
		
	}
	public static void main(String[] args) {
		ComponentDemo demo=new ComponentDemo();
		
		//������ڵ�
		Composite rootComposite=demo.new Composite();
		
		rootComposite.name="���ڵ�";
		
		//��ڵ�
		Composite compositeLeft=demo.new Composite();
		compositeLeft.name="��ڵ�";
		
		//�����ҽڵ㣬��������Ҷ�ӽڵ㣬Ҳ�����Ӳ���
		Composite compositeRight=demo.new Composite();
		compositeRight.name="�ҽڵ�";
		Leaf leaf1=demo.new Leaf();
		
	}
	
}