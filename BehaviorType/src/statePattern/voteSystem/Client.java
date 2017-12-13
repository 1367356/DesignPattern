package statePattern.voteSystem;

/**
 * ¿Í»§¶ËÀà
 * @author admin
 *
 */
public class Client {

	public static void main(String[] args) {
		VoteManager vm=new VoteManager();
		
		for(int i=0;i<=9;i++){
			vm.vote("ul", "a");
		}
	}
}
