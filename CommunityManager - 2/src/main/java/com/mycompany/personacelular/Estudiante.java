/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public class Estudiante extends Persona{
    
    private String carrera;
    private String universidad;
    private String curso;
    
    public Estudiante(String nombre, int edad, String ciudad, String hobby, Celular cel, String carrera, String universidad, String curso) {
        
        super(nombre, edad, ciudad, hobby, cel);
        
        this.carrera = carrera;
        this.universidad = universidad;
        this.curso = curso;
        
    }
    
    @Override
    public void presentarse(){
        
        System.out.println ("Hola, soy "+nombre+" y estudio la carrera "+carrera+" en el curso "+curso);
        
    }
    
    public void cursar(){
        
        System.out.println ("Voy a cursar a la universidad de "+universidad);
        
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
