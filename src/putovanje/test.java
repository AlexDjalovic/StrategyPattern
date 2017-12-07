package putovanje;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		nacinPlacanja np=null;
		transport t=null;
		
		System.out.println("unesite vid placanja");
		String vidPlacanja=new Scanner(System.in).next();
		System.out.println("unesite vid transporta: ");
		String vidTransporta=new Scanner(System.in).next();
		destinacija des=null;
		if(vidPlacanja.equalsIgnoreCase("kes")){
			np=new kes();
		}else if(vidPlacanja.equalsIgnoreCase("kartica")){
			 np=new kartica();
		}
		if(vidTransporta.equalsIgnoreCase("bus")){
			t=new bus();
		}else if(vidTransporta.equalsIgnoreCase("avion")){
			t=new avion();
		}
		
		System.out.println("izaberite destinaciju: ");
		String zeljenaDes=new Scanner(System.in).next();
		if(zeljenaDes.equalsIgnoreCase("grcka")){
			des=new grcka(np,t);
		}else if(zeljenaDes.equalsIgnoreCase("spanija")){
			des=new spanija(np,t);
		}
			System.out.println(des.prikaziPonudu());
			//System.out.println(des.konacnaCena(np));
			System.out.println(des.finalprice(vidPlacanja));
			/////////////////////
			
			
	
	
	}

}
