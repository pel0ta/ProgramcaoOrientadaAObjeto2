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
public class gerente implements comicao {

    @Override
    public float comicao(float valorvenda) {
        return valorvenda* Float.parseFloat("0.03");
        
    }
    
}
