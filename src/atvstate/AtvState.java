/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvstate;

/**
 *
 * @author dti
 */
public class AtvState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Porta p = new Porta();
        Estado a = new Aberta();
        
        p.setEstado(a);
        
        System.out.println(p.status());
        p.clicar();
        System.out.println(p.status());
        p.clicar();
        System.out.println(p.status());
        p.clicar();
        System.out.println(p.status());
        p.clicar();
        System.out.println(p.status());
        p.clicar();
        System.out.println(p.status());
    }
    
}
