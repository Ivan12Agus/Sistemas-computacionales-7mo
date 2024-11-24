
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public class CommunityManager extends Persona{
    
    private String redSocial;
    private int cantSeguidores;
    
    public CommunityManager(String nombre, int edad, String ciudad, String hobby, Celular cel, String redSocial, int cantSeguidores) { //Metodo constructor
        
        super(nombre, edad, ciudad, hobby, cel); //Super esta reservada para heredar de persona en este caso
        
        this.redSocial = redSocial;
        this.cantSeguidores = cantSeguidores;
        
    }
    
    @Override //El Override es para que no tome la funcion presentarse de persona y use la de CommunityManager
    public void presentarse(){
        
        System.out.println ("Hola, soy "+nombre+" y yo soy un manager de de una cuenta con "+cantSeguidores+" seguidores");
        
    }
    
    public void crearContenido(){
        
        System.out.println ("Acabo de subir contenido a la red social "+redSocial);
        
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public int getCantSeguidores() {
        return cantSeguidores;
    }

    public void setCantSeguidores(int cantSeguidores) {
        this.cantSeguidores = cantSeguidores;
    }
    
}
