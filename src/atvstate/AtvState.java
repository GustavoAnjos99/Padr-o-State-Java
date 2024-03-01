package atvstate;

public class AtvState {

    public static void main(String[] args) {
        Porta p = new Porta();
        
        p.setEstado(0);
        
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
        p.clicar();
        System.out.println(p.status());
        
    }
    
}
