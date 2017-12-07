package putovanje;

public class grcka extends destinacija {

	public grcka(nacinPlacanja np, transport t) {
		super(np, t);
		
	}

	@Override
	public double cena() {
		// TODO Auto-generated method stub
		return 20000;
	}

	public String toString(){
		return "izabrali ste Grcku \n";
	}
}
