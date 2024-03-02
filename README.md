# Sistema de troca de estado no padrão State
O Código funciona seguindo a seguinte lógica: Primeiro é criada a interface ESTADO, que faz a assinatura do método clicar(). Assim, as classes ABERTA, FECHANDO, FECHADA, ABRINDO e MANTER ABERTA implementam a interface, e colocam no corpo do método uma instância da classe seguinte e retorna a mesma. A ordem de instância segue esse diagrama:

![image](https://github.com/GustavoAnjos99/Padrao-State-Java/assets/132578544/1d73178c-735b-4f47-90c2-d6511cb1d890)

Então, a classe PORTA que é o contexto, guarda o estado atual e executa o método clicar() do estado atual e o retorno vai virar o próximo estado atual. 
> Antes de tudo, deverá “setar” o estado atual para assim começar a execução do código.

## Interface Estado
public interface Estado {
	public Estado clicar();
}

## Classe Porta
public class Porta {
public final Estado aberta = new Aberta();
public final Estado fechada = new Fechada();
public final Estado fechando = new Fechando();
public final Estado abrindo = new Abrindo();
public final Estado manterAberta = new ManterAberta();
Estado[] estados = {fechada, abrindo, aberta, fechando, manterAberta};
private Estado estadoAtual;

public Estado status(){
    return estadoAtual;
}

public void setEstado(int i){
    this.estadoAtual = estados[i];
}

public void clicar(){
    estadoAtual = estadoAtual.clicar();
}
}

## Classe Aberta
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

## Classe Fechando
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

## Classe Fechada
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

## Classe Abrindo
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

## Classe ManterAberta
public class ManterAberta implements Estado {
@Override
public Estado clicar(){
	Estado fechando = new Fechando();
	return fechando;
};

@Override
public String toString(){
    return("mantendo aberta");
}
}
# Diagrama do código
![image](https://github.com/GustavoAnjos99/Padrao-State-Java/assets/132578544/22574dfb-04ce-4c40-8e16-53cfdaf847aa)
