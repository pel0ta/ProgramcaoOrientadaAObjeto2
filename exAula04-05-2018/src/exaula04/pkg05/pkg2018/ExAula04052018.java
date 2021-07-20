/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaula04.pkg05.pkg2018;

/**
 *
 * @author marcu
 */
public class ExAula04052018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        atacarForte af=new atacarForte();
        atacarMedio am=new atacarMedio();
        atacarfraco afr=new atacarfraco();
        correrDevagar cd=new correrDevagar();
        correrMedio cm=new correrMedio();
        correrRapido cr=new correrRapido();
        pularAlto pa=new pularAlto();
        pularBaixo pb= new pularBaixo();
        pularMedio pm=new pularMedio();
        persogem01 p1= new persogem01(af, cr, pm);
        personagem02 p2=new personagem02(am, cd, pa);
        personagem03 p3=new personagem03(afr, cm, pb);
        
        System.out.println("Personagem 01");
        System.out.println(""+p1.atacar.atacar());
        System.out.println(""+p1.pulo.pular());
        System.out.println(""+p1.correr.correr());
        
        System.out.println("Personagem 02");
        System.out.println(""+p1.atacar.atacar());
        System.out.println(""+p1.pulo.pular());
        System.out.println(""+p1.correr.correr());
        
        System.out.println("Personagem 03");
        System.out.println(""+p1.atacar.atacar());
        System.out.println(""+p1.pulo.pular());
        System.out.println(""+p1.correr.correr());
    }
    
}
