package In.com.Interface;

public class Businessmen implements Richman,SocialWorker {

	@Override
	public void HelpToOther() {
		System.out.println(" Help to other person");
		
	}

	@Override
	public void earnmoney() {
		System.out.println(" Earn money ");
		
	}

	@Override
	public void donation() {
		System.out.println(" Give donation ");
		
	}

	@Override
	public void party() {
		System.out.println(" Party ");
		
	}
	public static void main(String[] args) {
		
		Businessmen b = new Businessmen();
		b.donation();
		b.earnmoney();
		b.party();
		b.HelpToOther();
	}
}
