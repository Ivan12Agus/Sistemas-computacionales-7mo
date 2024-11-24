
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
        
        Celular cel2 = new Celular("Claro", //Creacion de objeto de la clase Celular
        1122446688,
        "iPhone",
        false);
        
        Celular cel3 = new Celular("Movistar", //Creacion de objeto de la clase Celular
        1188664422,
        "Huawei",
        false);
        
        Persona pers1 = new Persona("Juan",
        43,
        "Quilmes",
        "Escuchar musica",
        cel1);
        
        CommunityManager cm1 = new CommunityManager("Joaquin",
        23,
        "Palermo",
        "Tomar cafe",
        cel2,
        "Snapchat",
        2350);
        
        Estudiante es1 = new Estudiante("Jose",
        25,
        "Avellaneda",
        "Dormir",
        cel3,
        "Ingenieria en sistemas",
        "UTN",
        "1er curso");
        
        pers1.presentarse();
        
        cm1.presentarse();
        cm1.crearContenido();
        
        es1.presentarse();
        es1.cursar();
        
    }
    
}