
package Model;


public class CadastroPaciente {
    
    
    private int ID;
    private String nome;
    private String cpf;
    private String idade;
    private String endereco;
    private String telefone;
    private String Comorbidade;
    private String situacao;
    

    public CadastroPaciente ( int ID, String nome, String cpf, String idade, String endereco, String telefone, String Comorbidade, String situacao) {
         this.ID = ID;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.Comorbidade = Comorbidade;
        this.situacao = situacao;
       
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public CadastroPaciente() {
       }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
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

    public String getComorbidade() {
        return Comorbidade;
    }

    public void setComorbidade(String Comorbidade) {
        this.Comorbidade = Comorbidade;
    }

  
}