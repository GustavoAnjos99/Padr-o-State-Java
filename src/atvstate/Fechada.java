/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvstate;

/**
 *
 * @author dti
 */
public class Fechada implements Estado {
    @Override
    public Estado clicar(){
       Estado abrindo = new Abrindo();

       return abrindo;
    };
    
    @Override
    public String toString(){
        return("fechada");
    }
    
}
