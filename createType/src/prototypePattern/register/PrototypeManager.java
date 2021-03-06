package prototypePattern.register;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

	/**
	 * 用来记录原型的编号和原型实例的对应关系
	 */
	private static Map<String,Prototype> map=new HashMap();
	
	/**
	 * 私有化构造方法，避免外部创建实例
	 */
	private PrototypeManager() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 向原型管理器里面添加或是修改某个原型注册
	 * @param PrototypeId原型编号，
	 * @param prototype  原型实例
	 * 因为要操作到map，所以需要同步，防止同时操作一个对象
	 * 既增加有减少等事件的发生
	 */
	public synchronized static void setPrototype(String prototypeId,Prototype prototype){
		map.put(prototypeId, prototype);
	}
	
	/**
	 * 从原型管理器删除某个原型注册
	 * @param prototypeId 原型编号
	 */
	public synchronized static void removePrototype(String prototypeId){
		map.remove(prototypeId);
	}
	
	public synchronized static Prototype getPrototype(String prototypeId) throws Exception{
		Prototype prototype=map.get(prototypeId);
		if(prototype==null){
			throw new Exception("您希望获取的原型还没有注册或已被销毁");
		}
		return prototype;
	}
	
}
