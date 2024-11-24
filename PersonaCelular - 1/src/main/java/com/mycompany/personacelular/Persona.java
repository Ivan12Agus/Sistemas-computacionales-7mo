
package com.mycompany.personacelular;

public class Persona {
    
    private String nombre;
    private String nick;
    private String mail;
    private int edad;
    private String ciudad;
    private String hobby; //Atributos
    
    private Celular cel;
    
    public Persona(String nombre, String nick, String mail, int edad, String ciudad, String hobby, Celular cel){ //Metodo constructor
    
        this.nombre = nombre;
        this.nick = nick;
        this.mail = mail;
        this.edad = edad;
        this.ciudad = ciudad;
        this.hobby = hobby;
        this.cel = cel;
        
    }
    
    public void presentarse() { //Metodo
    
        System.out.println ("Hola, mi nombre es "+this.nombre);
        
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
    
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
