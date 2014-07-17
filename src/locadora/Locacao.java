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
public class Locacao {

    private int nrLocacao;
    private Cliente cliente;
    private Item item;
    private Item[] itemArray = new Item[10];
    private int posicao;
    private double vlrTotal;

    public Locacao(int nrlocacao, Cliente cliente) {
        this.nrLocacao = nrlocacao;
        this.cliente = cliente;

    }

    public int getNrLocacao() {
        return nrLocacao;
    }

    public void setNrLocacao(int nrLocacao) {
        this.nrLocacao = nrLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getVlrTotal() {
        return vlrTotal;
    }

    public void insereItem(String nrSerie, Filmes filme, Midia midia) {

        Item item = new Item(nrSerie, midia, filme);

        gravaItem(item);
    }

    private void gravaItem(Item item) {

        itemArray[posicao] = item;
        posicao++;
    }

    public void removeItem(int posicao) {
        int tam = this.itemArray.length;

        if (posicao >= tam) {
            System.out.println("Posição invalida!");
        } else {
            System.out.println("---------------------------------------------------");
            System.out.println ("--- Cancelando o item da posição "+posicao+" da locação "+this.getNrLocacao()+" ---");
            System.out.println("---------------------------------------------------");
            itemArray[posicao] = null;
        }
    }

    public void imprime() {

        this.vlrTotal = 0;

        System.out.println("Locacao:" + this.getNrLocacao());
        System.out.println("Cliente:" + this.getCliente().getNome());
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < itemArray.length; i++) {

            Item item = itemArray[i];
            if (item != null) {
                System.out.println("Titulo:" + item.getFilme().getTitulo() + " Genero:" + item.getFilme().getGenero() + " Valor:" + item.getValor() + " Entrega:" + item.getEntrega());
                this.vlrTotal += item.getValor();
            }

        }
        System.out.println("                                                  T O T A L:" + this.getVlrTotal());
        System.out.println(" ");
    }
}
