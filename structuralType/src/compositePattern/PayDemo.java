package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ģʽ
 * @author admin
 *
 */
public class PayDemo {

	public abstract class Market{
		String name;
		
		public abstract void add(Market m);
		public abstract void removem(Market m);
		public abstract void payByCard();
	}
	
	//�ֵ꣬��������м��˵�
	public class MarketBrance extends Market{

		//���˵��б�
		List<Market> list=new ArrayList<PayDemo.Market>();
		
		public MarketBrance(String s) {
			// TODO Auto-generated constructor stub
			this.name=s;
		}
		@Override
		public void add(Market m) {
			// TODO Auto-generated method stub
			list.add(m);
		}

		@Override
		public void removem(Market m) {
			// TODO Auto-generated method stub
			list.remove(m);
		}

		@Override
		public void payByCard() {
			// TODO Auto-generated method stub
			System.out.println(name+"���ѣ��������ۼ���û�Ա��");
			for (Market m : list) {
				m.payByCard();
			}
		}
		
	}
	
	//���˵꣬���治���зֵ�ͼ��˵꣬��ײ�
	public class MarketJoin extends Market{

		public MarketJoin(String s){
			this.name=s;
		}
		@Override
		public void add(Market m) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removem(Market m) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void payByCard() {
			// TODO Auto-generated method stub
			System.out.println(name+"���ѣ��������ۼ���û�Ա��");
		}
		
	}
	public static void main(String[] args) {
		PayDemo demo=new PayDemo();
		
		MarketBrance rootBranch=demo.new MarketBrance("�ܵ�");
		MarketBrance qhdBranch=demo.new MarketBrance("�ػʵ��ֵ�");
		MarketJoin hgqJoin=demo.new MarketJoin("�ػʵ��ֵ�1");
		MarketJoin join2=demo.new MarketJoin("�ػʵ��ֵ�2");
		
		qhdBranch.add(hgqJoin);
		qhdBranch.add(join2);
		rootBranch.add(qhdBranch);
		rootBranch.payByCard();
		
	}
}