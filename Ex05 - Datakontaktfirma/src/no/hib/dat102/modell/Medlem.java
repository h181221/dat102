package no.hib.dat102.modell;

import no.hib.dat102.mengde.adt.MengdeADT;
import no.hib.dat102.mengde.kjedet.KjedetMengde;

public class Medlem {
	private String navn;
	private MengdeADT<Hobby> hobby;
	private int statusIndeks;

	public Medlem() {
		this("",-1);
	}

	public Medlem(String navn, int index) {
		this.navn = navn;
		this.hobby = new KjedetMengde<Hobby>();
		this.statusIndeks = index;
		
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public MengdeADT<Hobby> getHobby() {
		return hobby;
	}

	public void setHobby(MengdeADT<Hobby> hobby) {
		this.hobby = hobby;
	}

	public int getStatusIndeks() {
		return statusIndeks;
	}

	public void setStatusIndeks(int statusIndeks) {
		this.statusIndeks = statusIndeks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Medlem: [" + navn + ", hobby: " + hobby + ", statusIndeks: " + statusIndeks + "]";
	}

	/**
	 * avgj�r om to medlemmer passer til hverandre og alts� kan danne et par. To
	 * medlemmer passer til hverandre dersom de har n�yaktig samme hobbyer
	 * 
	 * @param medlem2
	 */
	public boolean passerTil(Medlem medlem2) {
		return this.hobby.erLik(medlem2.getHobby());
	}

}
