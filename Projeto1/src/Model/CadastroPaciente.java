
package Model;


public class CadastroPaciente {
    
    
    private String nome;
    private String cpf;
    private String idade;
    private String endereco;
    private String telefone;
    private String Comorbidade;
    private int ID;

    public CadastroPaciente (String nome, String cpf, String idade, String endereco, String telefone, String Comorbidade, int ID) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.Comorbidade = Comorbidade;
        this.ID = ID;
    }

    public CadastroPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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