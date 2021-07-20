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
public class quiosque {
    imaquinaBebida maquina;
    public quiosque(imaquinaBebida m){
        this.maquina = m;
    }
    public String getrefri(){
    return maquina.entregarRefrigente().pegar();
    }
    public String getsuco(){
        return maquina.entregarSuco().pegar();
    }
}
