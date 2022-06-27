package br.com.market.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "valor")
    private double valor;

    @Column(name = "data")
    private String data;

    @OneToMany(mappedBy = "pedido")
    private java.util.List<PedidoProduto> pedidoProdutos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public java.util.List<PedidoProduto> getPedidoProdutos() {
        return pedidoProdutos;
    }

    public void setPedidoProdutos(java.util.List<PedidoProduto> pedidoProdutos) {
        this.pedidoProdutos = pedidoProdutos;
    }

    
}
