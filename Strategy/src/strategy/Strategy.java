/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

/**
 *
 * @author marcu
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        atendente a= new atendente();
        vendedor v= new vendedor();
        gerente g= new gerente();
        diretor d= new diretor();
        
        ArrayList<funcionario> listafuncionario = new ArrayList<funcionario>();
           funcionario fa= new funcionario(a);
           listafuncionario.add(fa);
           funcionario fv=new funcionario(v);
           listafuncionario.add(fv);
           funcionario fg= new funcionario(g);
           listafuncionario.add(fg);
           funcionario fg2=new funcionario(g);
           listafuncionario.add(fg2);
           funcionario fd=new funcionario(d);
           listafuncionario.add(fd);
        
           fv.setVlrcomicao(g);
           
           for(funcionario f:listafuncionario){
               float com=f.getVlrcomicao().comicao(500);
               System.out.println("valor final"+com);
           }
    }
}
