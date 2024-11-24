
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public abstract class RedesSociales {
    
    public int peso; //La consigna no dice que atributos debe tener esta clase, asi que le puse el peso de la aplicacion
    
    public RedesSociales(int peso){
        
        this.peso = peso;
        
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
