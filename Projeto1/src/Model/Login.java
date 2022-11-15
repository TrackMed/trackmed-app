package Model;

import javax.swing.JPasswordField;


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

    public Login(String crm, String senha) {
        this.crm = crm;
        this.senha = senha;
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
