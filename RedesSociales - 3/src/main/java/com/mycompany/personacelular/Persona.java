
package com.mycompany.personacelular;

public class Persona {
    
    public String nombre; //Tuve que cambiar la privacidad de nombre a public para poder usarlo en CommunityManager y Estudiante
    private int edad;
    private String ciudad;
    private String hobby;
    
    private Celular cel;
    
    public Persona(String nombre, int edad, String ciudad, String hobby, Celular cel){
    
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.hobby = hobby;
        this.cel = cel;
        
    }
    
    public void agarrarCel() {
    
        System.out.println ("Acabo de agarrar mi celular "+getCel().getModelo()); //Hace falta el getCel para poder acceder a los metodos y atributos del celular
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Celular getCel() {
        return cel;
    }

    public void setCel(Celular cel) {
        this.cel = cel;
    }
    
}
