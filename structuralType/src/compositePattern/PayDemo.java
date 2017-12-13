package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
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
	
	//分店，下面可以有加盟店
	public class MarketBrance extends Market{

		//加盟店列表
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
			System.out.println(name+"消费，积分已累加入该会员卡");
			for (Market m : list) {
				m.payByCard();
			}
		}
		
	}
	
	//加盟店，下面不再有分店和加盟店，最底层
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
			System.out.println(name+"消费，积分已累加入该会员卡");
		}
		
	}
	public static void main(String[] args) {
		PayDemo demo=new PayDemo();
		
		MarketBrance rootBranch=demo.new MarketBrance("总店");
		MarketBrance qhdBranch=demo.new MarketBrance("秦皇岛分店");
		MarketJoin hgqJoin=demo.new MarketJoin("秦皇岛分店1");
		MarketJoin join2=demo.new MarketJoin("秦皇岛分店2");
		
		qhdBranch.add(hgqJoin);
		qhdBranch.add(join2);
		rootBranch.add(qhdBranch);
		rootBranch.payByCard();
		
	}
}
