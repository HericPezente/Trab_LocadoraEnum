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
    private String tipo_midia;
    private double valor;
    
    //chama midia e acrescenta valor
    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getTipo_midia() {
        return tipo_midia;
    }

    public void setTipo_midia(String tipo_midia) {
        this.tipo_midia = tipo_midia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
