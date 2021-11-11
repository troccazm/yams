
public class Combinaisons{
	
	//premiere section
	
	public int un = 0;
    public int deux = 0;
    public int trois = 0;
    public int quatre = 0;
    public int cinq = 0;
    public int six = 0;
    public boolean aBonus = false;
    
    //deuxieme section
    
	public int brelan;
    public int carre;
    public boolean aBrelan = false;
    public boolean aCarre = false;
    public boolean aFull = false;
    public boolean aPetiteSuite = false;
    public boolean aGrandeSuite = false;
    public boolean aYam = false;
    
    //S1
    
    public void setUn(int de1, int de2, int de3, int de4, int de5) {
        if (de1 == 1) {
            un+= 1;
        }
        if (de2 == 1) {
            un+= 1;
        }
        if (de3 == 1) {
        	un+= 1;
        }
        if (de4 == 1) {
        	un+= 1;
        }
        if (de5 == 1) {
        	un+= 1;
        }
    }
    
    //public void Un(De[] des) {
    	//un= 1* des.countUp(1);
    //}
    
    public void setDeux(int de1, int de2, int de3, int de4, int de5) {
        if (de1 == 2) {
        	deux+= 2;
        }
        if (de2 == 2) {
        	deux+= 2;
        }
        if (de3 == 2) {
        	deux+= 2;
        }
        if (de4 == 2) {
        	deux+= 2;
        }
        if (de5 == 2) {
        	deux+= 2;
        }
    }
    
    public void setTrois(int de1, int de2, int de3, int de4, int de5) {
        if (de1 == 3) {
        	trois+= 3;
        }
        if (de2 == 3) {
        	trois+= 3;
        }
        if (de3 == 3) {
        	trois+= 3;
        }
        if (de4 == 3) {
        	trois+= 3;
        }
        if (de5 == 3) {
        	trois+= 3;
        }
    }
    
    public void setQuatre(int de1, int de2, int de3, int de4, int de5) {
        if (de1 == 4) {
            quatre+= 4;
        }
        if (de2 == 4) {
        	quatre+= 4;        
        }
        if (de3 == 4) {
        	quatre+= 4;        
        }
        if (de4 == 4) {
        	quatre+= 4;        
        }
        if (de5 == 4) {
        	quatre+= 4;        
        }
    }
    
    public void setCinq(int de1, int de2, int de3, int de4, int de5) {
        if (de1 == 5) {
            cinq+= 5;
        }
        if (de2 == 5) {
            cinq+= 5;
        }
        if (de3 == 5) {
            cinq+= 5;
        }
        if (de4 == 5) {
            cinq+= 5;
        }
        if (de5 == 5) {
            cinq+= 5;
        }
    }
    
    public void setSix(int de1, int de2, int de3, int de4, int de5) {
        if (de1 == 6) {
            six+= 6;
        }
        if (de2 == 6) {
            six+= 6;
        }
        if (de3 == 6) {
            six+= 6;
        }
        if (de4 == 6) {
            six+= 6;
        }
        if (de5 == 6) {
            six+= 6;
        }
    }
    
    // S2

    public void setBrelan(int de1, int de2, int de3, int de4, int de5) {
        //134, 135, 145, 245
        if ((de1 == de3 && de1 == de4) || (de1 == de3 && de1 == de5) || 
        		(de1 == de4 && de1 == de5) || (de2 == de4 && de2 == de5) || 
        		(de1 == de2 && de1 == de3) || (de1 == de2 && de1 == de4) || 
        		(de1 == de2 && de1 == de5) || (de2 == de3 && de2 == de4) || 
        		(de2 == de3 && de2 == de5) || (de3 == de4 && de3 == de5)) {
            brelan = de1 + de2 + de3 + de4 + de5;
            aBrelan = true;
        } else {
            aBrelan = false;
        }
    }
    
    public void setCarre(int de1, int de2, int de3, int de4, int de5) {
        //1234, 1345, 1245, 1235, 2345
        if ((de1 == de2 && de1 == de3 && de1 == de4) || 
        		(de1 == de3 && de1 == de4 && de1 == de5) || 
        		(de1 == de2 && de1 == de4 && de1 == de5) || 
        		(de1 == de2 && de1 == de3 && de1 == de5) || 
        		(de2 == de3 && de2 == de4 && de2 == de5)) {
            carre = de1 + de2 + de3 + de4 + de5;
            aCarre = true;
        } else {
            aCarre = false;
        }
    }
    
    public void setFull(int de1, int de2, int de3, int de4, int de5) {
        // 134 & 25, 135 & 24, 145 & 23, 245 & 13
        if ((de1 == de3 && de1 == de4 && de1 != de2 && de2 == de5) || 
        		(de1 == de3 && de1 == de5 && de1 != de2 && de2 == de4) || 
        		(de1 == de4 && de1 == de5 && de1 != de2 && de2 == de3) || 
        		(de2 == de4 && de2 == de5 && de2 != de1 && de1 == de3) || 
        		(de1 == de2 && de1 == de3 && de1 != de4 && de4 == de5) || 
        		(de1 == de2 && de1 == de4 && de1 != de3 && de3 == de5) ||
        		(de1 == de2 && de1 == de5 && de1 != de3 && de3 == de4) || 
        		(de2 == de3 && de2 == de4 && de2 != de1 && de1 == de5) || 
        		(de2 == de3 && de2 == de5 && de2 != de1 && de1 == de4) || 
        		(de3 == de4 && de3 == de5 && de3 != de1 && de1 == de2)) {
            aFull = true;
        } else {
            aFull = false;
        }
    }
    
    public void setPsuite(int de1, int de2, int de3, int de4, int de5) {
    	// 1234, 2345, 3456
        if ((de1 == 1 || de2 == 1 || de3 == 1 || de4 == 1 || de5 == 1) && 
        		(de1 == 2 || de2 == 2 || de3 == 2 || de4 == 2 || de5 == 2) && 
        		(de1 == 3 || de2 == 3 || de3 == 3 || de4 == 3 || de5 == 3) && 
        		(de1 == 4 || de2 == 4 || de3 == 4 || de4 == 4 || de5 == 4)) {
            aPetiteSuite = true;
        } else if ((de1 == 2 || de2 == 2 || de3 == 2 || de4 == 2 || de5 == 2) && 
        		(de1 == 3 || de2 == 3 || de3 == 3 || de4 == 3 || de5 == 3) && 
        		(de1 == 4 || de2 == 4 || de3 == 4 || de4 == 4 || de5 == 4) && 
        		(de1 == 5 || de2 == 5 || de3 == 5 || de4 == 5 || de5 == 5)) {
        	aPetiteSuite = true;
        } else if ((de1 == 3 || de2 == 3 || de3 == 3 || de4 == 3 || de5 == 3) && 
        		(de1 == 4 || de2 == 4 || de3 == 4 || de4 == 4 || de5 == 4) && 
        		(de1 == 5 || de2 == 5 || de3 == 5 || de4 == 5 || de5 == 5) && 
        		(de1 == 6 || de2 == 6 || de3 == 6 || de4 == 6 || de5 == 6)) {
        	aPetiteSuite = true;
        } else {
        	aPetiteSuite = false;
        }
    }
    
    public void setGsuite(int de1, int de2, int de3, int de4, int de5) {
    	// 12345, 23456
        if ((de1 == 1 || de2 == 1 || de3 == 1 || de4 == 1 || de5 == 1) && 
        		(de1 == 2 || de2 == 2 || de3 == 2 || de4 == 2 || de5 == 2) && 
        		(de1 == 3 || de2 == 3 || de3 == 3 || de4 == 3 || de5 == 3) && 
        		(de1 == 4 || de2 == 4 || de3 == 4 || de4 == 4 || de5 == 4) && 
        		(de1 == 5 || de2 == 5 || de3 == 5 || de4 == 5 || de5 == 5)) {
            aGrandeSuite = true;
        } else if ((de1 == 2 || de2 == 2 || de3 == 2 || de4 == 2 || de5 == 2) && 
        		(de1 == 3 || de2 == 3 || de3 == 3 || de4 == 3 || de5 == 3) && 
        		(de1 == 4 || de2 == 4 || de3 == 4 || de4 == 4 || de5 == 4) && 
        		(de1 == 5 || de2 == 5 || de3 == 5 || de4 == 5 || de5 == 5) &&
        		(de1 == 6 || de2 == 6 || de3 == 6 || de4 == 6 || de5 == 6)) {
        	aGrandeSuite = true;
        } else {
        	aGrandeSuite = false;
        }
    }
    
    public void setYam(int de1, int de2, int de3, int de4, int de5) {
        if (de1 == de2 && de1 == de3 && de1 == de4 && de1 == de5) {
            aYam = true;
        }
        else{
            aYam = false;
        }
    }
    
}