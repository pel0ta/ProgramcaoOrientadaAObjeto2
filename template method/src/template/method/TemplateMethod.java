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
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       atendente a=new atendente();
       gerente g=new gerente();
       vendedor v=new vendedor();
       
       a.valorvenda=5000;
       v.valorvenda=16000;
       g.valorvenda=18000;
       
        System.out.println(a.getClass());
        System.out.println("meta mensal: " +a.getMeta());
        System.out.println("valor da venda" +a.valorvenda);
        System.out.println("valor da comiçao"+a.calculacomicao());
        
        System.out.println(v.getClass());
        System.out.println("meta mensal: " +v.getMeta() );
        System.out.println("valor da venda" +v.valorvenda);
        System.out.println("valor da comiçao"+v.calculacomicao());
        
        System.out.println(g.getClass());
        System.out.println("meta mensal: " +g.getMeta());
        System.out.println("valor da venda" +g.valorvenda);
        System.out.println("valor da comiçao"+g.calculacomicao());
        
    }
    
}
