/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryabstract;

/**
 *
 * @author marcu
 */
public class maquinaambev extends imaquinaBebida{

    @Override
    public refrigerante entregarRefrigente() {
        return new pepsi();
    }

    @Override
    public suco entregarSuco() {
        return new dobem();
    }

}
