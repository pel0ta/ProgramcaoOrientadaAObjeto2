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
public class gerente extends funcionario{

    @Override
    public float getMeta() {
        return 20000;
    }

    @Override
    public float getComicao() {
        return (float) 0.03;
    }

}
