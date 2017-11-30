package builderPattern.usingSecne;

import java.util.Date;

public abstract class Builder {

	//产品对象
	protected AutoMessage msg;
	//标题零件的建造方法，具体实现类去实现
	public abstract void buildSubject();
	//内容零件的建造方法,具体实现类去实现
	public abstract void buildBody();
	
	//收件人零件的建造方法
	public void buildTo(String to) {
		// TODO Auto-generated method stub
		msg.setTo(to);
	}
	
	//发件人零件的建造方法
	public void buildFrom(String from){
		msg.setFrom(from);
	}
	//发件人时间零件的建造方法
	public void buildSendDate(){
		msg.setSendDate(new Date());
	}
	/**
	 * 右键产品完成后，用此方法发送邮件
	 * 此方法相当于产品返还方法
	 */
	public void sendMessage(){
		msg.send();
	}
}
