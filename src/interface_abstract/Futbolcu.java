package interface_abstract;

public class Futbolcu extends Sporcu implements Yuzme {

	@Override
	public void yuzebilir() {
		// TODO Auto-generated method stub
		System.out.println("Futbolcunun yüzmesine gerek yoktur");
	}

	@Override
	public void kardiyo() {
		// TODO Auto-generated method stub
		
		System.out.println("Her sporcu kardiyo yapar");
		
	}

}
