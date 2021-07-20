/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author marcu
 */
public class maquinaRefri extends maquinaBebida{
    @Override
    public bebida entregarBebida() {
        return new refrigerante();
    }
    
}
