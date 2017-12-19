package com;

public class Operations {

    public static long additionner(final long...pNombres) {
        long lRetour = 0;
        for(final long lNombre : pNombres) {
            lRetour += lNombre;
        }
        return lRetour;
    }
    
    // Cette méthode ne fonctionne pas correctement
    // Les tests vont le vérifier 
    public static long multiplier(final long pNombres1, final long pNombres2) {
        long lRetour = 0;
        
        lRetour = pNombres1 * pNombres2;
        
        return lRetour;
    }
    
}
