/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvstate;

/**
 *
 * @author dti
 */
public class Fechando implements Estado{
    @Override
    public Estado clicar(){
       Estado fechada = new Fechada();
       return fechada;
    };
    
    @Override
    public String toString(){
        return("fechando");
    }
}
