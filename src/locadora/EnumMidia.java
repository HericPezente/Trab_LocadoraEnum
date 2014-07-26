/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public enum EnumMidia {
    
    VHS("VHS",2.5),
    DVD("DVD",2.5),
    BLU("BLU",3.5);
    
    
    
    private String tpMidia;
    private double valor;
    
    EnumMidia(String vhs,double valor){
        this.tpMidia=vhs;
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }
    
    
    
}
