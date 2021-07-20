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
public class refrigerante implements bebida{
    @Override
    public String tipoBebida() {
        return "refrigerante";
    }
}
