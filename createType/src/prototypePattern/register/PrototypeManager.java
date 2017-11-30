package prototypePattern.register;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

	/**
	 * ������¼ԭ�͵ı�ź�ԭ��ʵ���Ķ�Ӧ��ϵ
	 */
	private static Map<String,Prototype> map=new HashMap();
	
	/**
	 * ˽�л����췽���������ⲿ����ʵ��
	 */
	private PrototypeManager() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * ��ԭ�͹������������ӻ����޸�ĳ��ԭ��ע��
	 * @param PrototypeIdԭ�ͱ�ţ�
	 * @param prototype  ԭ��ʵ��
	 * ��ΪҪ������map��������Ҫͬ������ֹͬʱ����һ������
	 * �������м��ٵ��¼��ķ���
	 */
	public synchronized static void setPrototype(String prototypeId,Prototype prototype){
		map.put(prototypeId, prototype);
	}
	
	/**
	 * ��ԭ�͹�����ɾ��ĳ��ԭ��ע��
	 * @param prototypeId ԭ�ͱ��
	 */
	public synchronized static void removePrototype(String prototypeId){
		map.remove(prototypeId);
	}
	
	public synchronized static Prototype getPrototype(String prototypeId) throws Exception{
		Prototype prototype=map.get(prototypeId);
		if(prototype==null){
			throw new Exception("��ϣ����ȡ��ԭ�ͻ�û��ע����ѱ�����");
		}
		return prototype;
	}
	
}