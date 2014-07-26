/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author i03
 */
public class Programa {

    public Programa() {
        inicializa();
    }

    public void inicializa() {

        System.out.println("**** PROJETO LOCADORA ****");
        System.out.println("Equipe:");
        System.out.println("HERIC WALNIER PEZENTE");
        System.out.println("BRUNO FREITAS");
        System.out.println("JEFFERSON DOS PASSOS");
        System.out.println("");
        System.out.println("");

        Locacao[] vetLocacao = new Locacao[10];

        Filmes f1 = new Filmes("Resgate do Soldado Ryan", "Guerra", "Catalogo"); //VHS
        Filmes f2 = new Filmes("Transformers 4", "Acao", "Lancamento"); //DVD
        Filmes f3 = new Filmes("Planeta dos Macacos", "Ficcao", "Super Lancamento"); //BLU
        Filmes f4 = new Filmes("Gravidade", "Ficcao", "Super Lancamento");//DVD

        /*Midia m1 = new Midia();
        m1.setTpMidia("VHS");
        m1.setValor(2.50);

        Midia m2 = new Midia();
        m2.setTpMidia("DVD");
        m2.setValor(2.50);

        Midia m3 = new Midia();
        m3.setTpMidia("Blu");
        m3.setValor(3.50);*/

        Cliente c1 = new Cliente();
        c1.setNome("ISAAC NEWTON");
        Cliente c2 = new Cliente();
        c2.setNome("BENJAMIN FRANKLIN");

        /*Locacao l1 = new Locacao(1, c1);
        l1.insereItem("4444", f1, m1);
        l1.insereItem("5555", f3, m3);

        Locacao l2= new  Locacao(2,c2);
        l2.insereItem("7777", f2, m2);
        l2.insereItem("8888", f4, m2);
        l2.insereItem("9999", f3, m3);*/
        
        Locacao l1= new Locacao(1,c1);
        l1.insereItem("4444", f1,EnumMidia.VHS );
        l1.insereItem("5555", f3, EnumMidia.BLU);

        Locacao l2= new  Locacao(2,c2);
        l2.insereItem("7777", f2, EnumMidia.DVD);
        l2.insereItem("8888", f4, EnumMidia.DVD);
        l2.insereItem("9999", f3, EnumMidia.BLU);
        

        
        vetLocacao[0] = l1;
        vetLocacao[1]=l2;

        //Imprime valores
        for (int i = 0; i < vetLocacao.length; i++) {
            Locacao loc = vetLocacao[i];
            if (loc != null) {
                loc.imprime();

            }
        }
        
        l2.removeItem(1);
        
        for (int i = 0; i < vetLocacao.length; i++) {
            Locacao loc = vetLocacao[i];
            if (loc != null) {
                loc.imprime();
            }
        }

    }

    public static void main(String[] args) {

        new Programa();
    }

}
