package Model;




public class Login {
    
    
    private int ID;
    private String crm;
    private String senha;
    
    public Login(int ID, String crm, String senha){
    
    this.ID = ID;
    this.crm = crm;
    this.senha = senha;
    
    }

    public Login() {
   }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
  
}
