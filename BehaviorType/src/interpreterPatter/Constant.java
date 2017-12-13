package interpreterPatter;

/**
 * һ��Contant�������һ����������
 *
 */
public class Constant extends Expression{

	private boolean value;
	public Constant(boolean value) {
		this.value=value;
	}
	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null&&obj instanceof Constant){
			return this.value==((Constant)obj).value;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.toString().hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new Boolean(value).toString();
	}
	
}
