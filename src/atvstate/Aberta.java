/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvstate;

/**
 *
 * @author dti
 */
public class Aberta implements Estado {
    
    @Override
    public Estado clicar(){
       Estado manterAberta = new ManterAberta();
       return manterAberta;
    };
    
    @Override
    public String toString(){
        return("aberta");
    }
    
    
}
