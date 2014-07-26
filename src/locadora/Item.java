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
public class Item {

    
    private String numero_serie;
    //private Midia tipoMidia;
    private Filmes filme;
    private double valor;
    private String entrega;
    private EnumMidia enumMidia;

    
    /*
    public Item(String numero_serie, Midia tipoMidia, Filmes filme){
        this.numero_serie=numero_serie;
        this.tipoMidia= tipoMidia;
        this.filme= filme;
        
        calculaAcrescimo();
    }
    */
    
    public Item(String numero_serie, EnumMidia enumMidia, Filmes filme){
        this.numero_serie=numero_serie;
        this.enumMidia= enumMidia;
        this.filme= filme;
        
        calculaAcrescimo();
    }
    
    //chama midia e acrescenta valor
    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    /*public Midia getTipoMidia() {
        return tipoMidia;
    }*/
    
    public EnumMidia getEnumMidia(){
        return enumMidia;
    }

    /*public void setTipoMidia(Midia tipoMidia) {
        this.tipoMidia = tipoMidia;
    }*/

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Filmes getFilme() {
        return filme;
    }

    public void setFilme(Filmes filme) {
        this.filme = filme;
    }

    public String getEntrega() {
        return entrega;
    }
   
    
    
    public void calculaAcrescimo() {
        double valor = 0;
        String entrega=null;
        if (filme.getCategoria().equals("Catalogo")) {
            //valor = tipoMidia.getValor();
            valor=enumMidia.getValor();
            entrega=" 3 dias";
        } else if (filme.getCategoria().equals("Lancamento")) {
            
            //valor = tipoMidia.getValor() * 1.25;
            valor=enumMidia.getValor() * 1.25;
            entrega=" 2 dias";
        } else if (filme.getCategoria().equals("Super Lancamento")) {
            //valor = tipoMidia.getValor() * 1.50;
            valor=enumMidia.getValor() * 1.50;
            entrega=" 1 dia"; 
        }

        this.valor=valor;
        this.entrega=entrega;
    }
}
