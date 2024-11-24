
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public class CommunityManager extends Persona implements Presentable{
    
    private String redSocial;
    private int cantSeguidores;
    private Instagram instagram;
    
    public CommunityManager(String nombre, int edad, String ciudad, String hobby, Celular cel, String redSocial, int cantSeguidores, Instagram instagram) { //Metodo constructor
        
        super(nombre, edad, ciudad, hobby, cel); //Super esta reservada para heredar de persona en este caso
        
        this.redSocial = redSocial;
        this.cantSeguidores = cantSeguidores;
        
    }
    
    public void presentarse(){
        
        System.out.println ("Hola, soy "+nombre+" y yo soy un manager de de una cuenta con "+cantSeguidores+" seguidores");
        
    }
    
    public void crearContenido(){
        
        System.out.println ("Acabo de subir contenido a la red social "+redSocial);
        
    }
    
    @Override
    public void saludar() {
        
        System.out.println("Hola, soy "+nombre);
        
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

    public Instagram getInstagram() {
        return instagram;
    }

    public void setInstagram(Instagram instagram) {
        this.instagram = instagram;
    }
    
}
