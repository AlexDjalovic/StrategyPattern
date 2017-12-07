package putovanje;

public abstract class destinacija {

	nacinPlacanja np;
	transport t;
	
	public destinacija(nacinPlacanja np,transport t){
		this.np=np;  this.t=t;
	}
	public String prikaziPonudu(){
		String s=np.sredstvo()+","+t.verkehr();
		
		
		return this+""+s+"\ni to vas kosta: ";
		
		
	}
	
	
	public double finalprice(String s){
		double p=0;
		if(s.equalsIgnoreCase("kes")){
			p=cena()*0.8;
		}else if(s.equalsIgnoreCase("kartica")){
			p=cena();
		}
		return p;
	}
	public abstract double cena();
}
