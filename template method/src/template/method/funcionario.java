/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.method;

/**
 *
 * @author marcu
 */
public abstract class funcionario{
    float valorvenda;
    public final double calculacomicao(){
    if(valorvenda>=this.getMeta()){
        return this.getComicao()*valorvenda;
    }
        else
       return (this.getComicao()*0.8)*valorvenda;
    }
    
    public abstract float getMeta();
    public abstract float getComicao();
}
