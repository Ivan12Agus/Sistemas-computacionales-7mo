
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public class Estudiante extends Persona implements Presentable{
    
    private String carrera;
    private String universidad;
    private String curso;
    
    public Estudiante(String nombre, int edad, String ciudad, String hobby, Celular cel, String carrera, String universidad, String curso) {
        
        super(nombre, edad, ciudad, hobby, cel);
        
        this.carrera = carrera;
        this.universidad = universidad;
        this.curso = curso;
        
    }
    
    public void presentarse(){
        
        System.out.println ("Hola, soy "+nombre+" y estudio la carrera "+carrera+" en el curso "+curso);
        
    }
    
    public void cursar(){
        
        System.out.println ("Voy a cursar a la universidad de "+universidad);
        
    }
    
    @Override
    public void saludar() {
        
        System.out.println("Hola, soy "+nombre);
        
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
