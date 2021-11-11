
public class De {
	
	private int valeur;
	private boolean estbloque;
	
	public De() {
		valeur=0;
		estbloque=false;
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public boolean getEstBloque() {
		return estbloque;
	}
	
	public void bloquer() {
		if (estbloque==false)
			estbloque=true;
	}
	
	public void debloquer() {
		if (estbloque==true)
			estbloque=false;
	}
	
	public int lancer() {
		return this.valeur = (int)(Math.random()*6+1);
	}
	
	public String toString(){
        return Integer.toString(valeur);
    }
	
}
