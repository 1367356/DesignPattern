package abstractFactoryPattern;

/**
 * ���幤����
 * @author admin
 *
 */
public class MainboardFactory {

	public static MainBoard createMainBoard(int type){
		MainBoard mainBoard=null;
		if(type==1){
			mainBoard=new IntelMainBoard(755);
		}else if(type==2){
			mainBoard=new AmdMainBoard(938);
		}
		return mainBoard;
	}
}
