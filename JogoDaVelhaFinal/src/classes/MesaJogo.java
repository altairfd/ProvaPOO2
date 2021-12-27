package classes;
public class MesaJogo {

    private int[][] mesa = new int[3][3];
    
    public MesaJogo(){
        LimparMesa();
    }
    
    public void LimparMesa(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                mesa[linha][coluna]=0;
    }
    
    public void MostrarMesa(){
        System.out.println();
        for(int linha=0 ; linha<3 ; linha++){
        
            for(int coluna=0 ; coluna<3 ; coluna++){
                
                if(mesa[linha][coluna]==-1){
                    System.out.print(" X ");
                }
                if(mesa[linha][coluna]==1){
                    System.out.print(" O ");
                }
                if(mesa[linha][coluna]==0){
                    System.out.print("   ");
                }
                
                if(coluna==0 || coluna==1)
                    System.out.print("|");
            }
            System.out.println();
        }
                
    }

    public int getPosicao(int[] tentativa){
        return mesa[tentativa[0]][tentativa[1]];
    }
    
    public void setPosicao(int[] tentativa, int jogador){
        if(jogador == 1)
            mesa[tentativa[0]][tentativa[1]] = -1;
        else
            mesa[tentativa[0]][tentativa[1]] = 1;
        
        MostrarMesa();
    }

    public int verificarLinhas(){
        for(int linha = 0 ; linha < 3 ; linha++){

            if( (mesa[linha][0] + mesa[linha][1] + mesa[linha][2]) == -3)
                return -1;
            if( (mesa[linha][0] + mesa[linha][1] + mesa[linha][2]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int verificarColunas(){
        for(int coluna=0 ; coluna<3 ; coluna++){

            if( (mesa[0][coluna] + mesa[1][coluna] + mesa[2][coluna]) == -3)
                return -1;
            if( (mesa[0][coluna] + mesa[1][coluna] + mesa[2][coluna]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int verifcarDiagonais(){
        if( (mesa[0][0] + mesa[1][1] + mesa[2][2]) == -3)
            return -1;
        if( (mesa[0][0] + mesa[1][1] + mesa[2][2]) == 3)
            return 1;
        if( (mesa[0][2] + mesa[1][1] + mesa[2][0]) == -3)
            return -1;
        if( (mesa[0][2] + mesa[1][1] + mesa[2][0]) == 3)
            return 1;
        
        return 0;
    }

    public boolean mesaCompleta(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna < 3 ; coluna++)
                if( mesa[linha][coluna] == 0 )
                    return false;
        return true;
    }
}

