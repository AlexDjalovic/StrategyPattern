package putovanje;

public class spanija extends destinacija {

	public spanija(nacinPlacanja np, transport t) {
		super(np, t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cena() {
		// TODO Auto-generated method stub
		return 40000;
	}
	public String toString(){
		return "izabrali ste Spaniju \n";
	}
}
