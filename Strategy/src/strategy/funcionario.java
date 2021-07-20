/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author marcu
 */
public class funcionario {
    private comicao vlrcomicao;    

    public void setVlrcomicao(comicao vlrcomicao) {
        this.vlrcomicao = vlrcomicao;
    }
    
    public comicao getVlrcomicao() {
        return vlrcomicao;
    }
    
    public funcionario(comicao c){
    this.vlrcomicao=c;
    
    }
    
}
