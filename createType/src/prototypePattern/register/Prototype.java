package prototypePattern.register;

/**
 * �Ǽ�ԭ��
 * @author admin
 *
 */
public interface Prototype {

	public Prototype clonePrototype();
	public String getName();
	public void setName(String name);
}
