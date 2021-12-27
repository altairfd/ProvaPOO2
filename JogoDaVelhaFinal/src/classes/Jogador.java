package classes;

public abstract class Jogador {
    
    protected int[] tentativa = new int[2];
    protected int jogador;

    
    public Jogador(int jogador){
        this.jogador = jogador;
    }
    
    public abstract void jogar(MesaJogo nesaJogo);
    
    public abstract void Tentativa(MesaJogo tabuleiro);

    public boolean checaTentativa(int[] tentativa, MesaJogo nesaJogo){
        if(nesaJogo.getPosicao(tentativa) == 0)
            return true;
        else
            return false;
            
    }
    
}

