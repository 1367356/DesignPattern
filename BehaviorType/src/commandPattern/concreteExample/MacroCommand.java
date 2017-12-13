package commandPattern.concreteExample;

public interface MacroCommand extends Command{

	/**
	 * ������ۼ��Ĺ�������
	 * �������һ����Ա����
	 */
	public void add(Command cmd);
	/**
	 * ������ۼ��Ĺ�����
	 * ����ɾ��һ����Ա����
	 */
	public void remove(Command cmd);
}
