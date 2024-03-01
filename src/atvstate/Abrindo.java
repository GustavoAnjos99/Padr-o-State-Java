/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvstate;

/**
 *
 * @author dti
 */
public class Abrindo implements Estado {
    @Override
    public Estado clicar(){
       Estado aberta = new Aberta();
       return aberta;
    };
    
        @Override
    public String toString(){
        return("abrindo");
    }
}
