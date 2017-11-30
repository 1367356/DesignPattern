package prototypePattern.register;

/**
 * µÇ¼ÇÔ­ÐÍ
 * @author admin
 *
 */
public interface Prototype {

	public Prototype clonePrototype();
	public String getName();
	public void setName(String name);
}
