package builderPattern.usingSecne;

import java.util.Date;

public abstract class Builder {

	//��Ʒ����
	protected AutoMessage msg;
	//��������Ľ��췽��������ʵ����ȥʵ��
	public abstract void buildSubject();
	//��������Ľ��췽��,����ʵ����ȥʵ��
	public abstract void buildBody();
	
	//�ռ�������Ľ��췽��
	public void buildTo(String to) {
		// TODO Auto-generated method stub
		msg.setTo(to);
	}
	
	//����������Ľ��췽��
	public void buildFrom(String from){
		msg.setFrom(from);
	}
	//������ʱ������Ľ��췽��
	public void buildSendDate(){
		msg.setSendDate(new Date());
	}
	/**
	 * �Ҽ���Ʒ��ɺ��ô˷��������ʼ�
	 * �˷����൱�ڲ�Ʒ��������
	 */
	public void sendMessage(){
		msg.send();
	}
}
