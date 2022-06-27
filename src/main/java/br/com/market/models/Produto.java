package br.com.market.models;

import javax.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "valor")
    private double valor;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @OneToMany(mappedBy = "produto")
    private java.util.List<PedidoProduto> pedidoProdutos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public java.util.List<PedidoProduto> getPedidoProdutos() {
        return pedidoProdutos;
    }

    public void setPedidoProdutos(java.util.List<PedidoProduto> pedidoProdutos) {
        this.pedidoProdutos = pedidoProdutos;
    }

    

}
