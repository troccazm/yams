
import java.util.*;

public class TourCourant {
	
	private De[] des;
    private int[] count;
    Score score;
    
    public TourCourant(){
        des = new De[5];
        for(int i = 0; i < 5; i++)
            des[i] = new De();
        lancerDes(); 
        count = new int[6];
        updateCount();
    }
    
    public void lancerDes() {
    	for(int i = 0; i < 5; i++)
            des[i].lancer();
    }
    
    public void lanceDe(int numDe) {
    	des[numDe-1].lancer();
    	updateCount();
    }
    
    public int getDe(int numDe) {
    	return des[numDe-1].getValeur();
    	
    }
    
    public int countUp(int valeur){
    	//renvoie le nombre n de dés qui ont la valeur valeur.
    	int nbValeur=0;
    	for(int i=0; i<5; i++) {
    		if(des[i].getValeur()== valeur)
    			nbValeur++;
    	}
    	return nbValeur;		
    }

	private void updateCount() {
		 for(int i = 0; i < 6; i++){
             count[i] = countUp(i + 1);
         }
	}
	/*
	 * private int nbJoueurs; private int nbTours;
	 * 
	 * public Partie(int nbJoueurs ,int nbTours) { this.nbJoueurs=nbJoueurs;
	 * this.nbTours=nbTours; }
	 * 
	 * public int getNbTours() { return nbTours; }
	 * 
	 * public void selectionnerDes() {
	 * 
	 * }
	 * 
	 * public void lancerDes() {
	 * 
	 * }
	 * 
	 * public void determinerCombinaison() {
	 * 
	 * }
	 * 
	 * public void afficherScore() {
	 * 
	 * }
	 * 
	 * public void relancer(De[] des, boolean [] tab) { for (int
	 * i=0;i<des.length;i++) { if (tab[i]) { des[i].lancer(); } } }
	 */
	
}
