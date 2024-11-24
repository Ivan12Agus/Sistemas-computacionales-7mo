
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public class PersonaCelular {

    public static void main(String[] args) {
        
        Celular cel1 = new Celular("Movistar", //Creacion de objeto de la clase Celular
        1123456789,
        "Motorola",
        false);
        
        Celular cel2 = new Celular("Claro",
        1198765432,
        "iPhone",
        false);
        
        Persona pers1 = new Persona("Juan", //Creacion de objeto de la clase persona
        "Ju4nGmr",
        "JuanGamer@gmail.com",
        43,
        "Quilmes",
        "Escuchar musica",
        cel1);
        
        Persona pers2 = new Persona("Pedro",
        "PedPedro",
        "PedroDomingo@gmail.com",
        27,
        "Wilde",
        "Hacer deoirte",
        cel2);
        
        pers1.presentarse();
        pers2.presentarse();
        
        pers1.agarrarCel();
        pers2.agarrarCel();
        
        cel1.llamar();
        cel2.mensaje();
        
    }
    
}