/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 *
 * @author Victo
 */
@Entity
@Table(name = "cadastroo")
@NamedQueries({
    @NamedQuery(name = "Cadastroo.findAll", query = "SELECT c FROM Cadastroo c"),
    @NamedQuery(name = "Cadastroo.findById", query = "SELECT c FROM Cadastroo c WHERE c.id = :id"),
    @NamedQuery(name = "Cadastroo.findByNome", query = "SELECT c FROM Cadastroo c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cadastroo.findByCpf", query = "SELECT c FROM Cadastroo c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cadastroo.findByEndereco", query = "SELECT c FROM Cadastroo c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cadastroo.findByTelefone", query = "SELECT c FROM Cadastroo c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cadastroo.findByIdade", query = "SELECT c FROM Cadastroo c WHERE c.idade = :idade"),
    @NamedQuery(name = "Cadastroo.findByComorbidade", query = "SELECT c FROM Cadastroo c WHERE c.comorbidade = :comorbidade")})
public class Cadastroo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "idade")
    private String idade;
    @Basic(optional = false)
    @Column(name = "comorbidade")
    private String comorbidade;

    public Cadastroo() {
    }

    public Cadastroo(String cpf) {
        this.cpf = cpf;
    }

    public Cadastroo(String cpf, String id, String nome, String endereco, String telefone, String idade, String comorbidade) {
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.comorbidade = comorbidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastroo)) {
            return false;
        }
        Cadastroo other = (Cadastroo) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAO.Cadastroo[ cpf=" + cpf + " ]";
    }
    
}
