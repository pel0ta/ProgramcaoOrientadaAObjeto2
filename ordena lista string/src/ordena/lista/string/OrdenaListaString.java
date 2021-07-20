/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena.lista.string;

import java.util.ArrayList;

/**
 *
 * @author marcu
 */
public class OrdenaListaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> listanomes = new ArrayList<String>();
        listanomes.add("tulio");
        listanomes.add("marcus");
        
        listanomes.sort(null);
        
        for(String nome:listanomes){
            System.out.println(nome);
        }
        
        
    }
    
}
