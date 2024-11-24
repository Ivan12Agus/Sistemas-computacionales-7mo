
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public class Snapchat extends RedesSociales implements Posteable{
    
    private int cantPost;
    
    public Snapchat(int peso, int cantPost) {
        
        super(peso);
        
        this.cantPost = cantPost;
        
    }
    
    @Override
    public void postear() {
        
        System.out.println("Acabas de hacer un posteo en Snapchat");
        
    }

    public int getCantPost() {
        return cantPost;
    }

    public void setCantPost(int cantPost) {
        this.cantPost = cantPost;
    }
    
}
