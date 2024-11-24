
package com.mycompany.personacelular;

/**
 *
 * @author ivan
 */
public class Celular {
    
    private String empresa;
    private int numero;
    private String modelo;
    private boolean isBloqueado;

    public Celular (String empresa, int numero, String modelo, boolean isBloqueado) {
        
        this.empresa = empresa;
        this.numero = numero;
        this.modelo = modelo;
        this.isBloqueado = isBloqueado;
        
    }
    
    public void llamar(){
        
        System.out.println ("Estas llamando al numero "+numero);
        
    }
    
    public void mensaje(){
        
        System.out.println ("Le acabas de mandar mensaje a "+numero);
        
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isIsBloqueado() {
        return isBloqueado;
    }

    public void setIsBloqueado(boolean isBloqueado) {
        this.isBloqueado = isBloqueado;
    }
    
    
    
}
