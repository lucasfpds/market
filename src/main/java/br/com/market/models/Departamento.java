package br.com.market.models;

import javax.persistence.*;

@Entity
@Table(name = "departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private java.util.List<Produto> produtos;

    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

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

    public java.util.List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(java.util.List<Produto> produtos) {
        this.produtos = produtos;
    }

    

}
