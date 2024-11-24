
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public class Instagram extends RedesSociales implements Posteable{
    
    private int cantUsu; //Le pongo este atributo asi Instagram se puede distinguir de snapchat
    
    public Instagram(int peso, int cantUsu) {
        
        super(peso);
        
        this.cantUsu = cantUsu;
        
    }
    
    @Override
    public void postear() {
        
        System.out.println("Acabas de hacer un posteo en Instagram");
        
    }

    public int getCantUsu() {
        return cantUsu;
    }

    public void setCantUsu(int cantUsu) {
        this.cantUsu = cantUsu;
    }
    
}
