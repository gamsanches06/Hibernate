package model;
// Generated 09/11/2020 17:37:37 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "USUARIO")
public class Usuario  implements java.io.Serializable {


    @Id
    @Column (name = "USU_ID", nullable = false, precision = 10, scale = 0)
     private int USU_ID;
    
    @Column (name = "USU_LOGIN", nullable = false, length = 20)
     private String USU_LOGIN;
    
    @Column(name = "USU_SENHA", nullable = false, length = 20)
     private String USU_SENHA;

    public Usuario() {
    }

    public Usuario(int USU_ID, String USU_LOGIN, String USU_SENHA) {
       this.USU_ID = USU_ID;
       this.USU_LOGIN = USU_LOGIN;
       this.USU_SENHA = USU_SENHA;
    }
   
    public int getUSU_ID() {
        return this.USU_ID;
    }
    
    public void setUSU_ID(int USU_ID) {
        this.USU_ID = USU_ID;
    }
    public String getUSU_LOGIN() {
        return this.USU_LOGIN;
    }
    
    public void setUSU_LOGIN(String USU_LOGIN) {
        this.USU_LOGIN = USU_LOGIN;
    }
    public String getUSU_SENHA() {
        return this.USU_SENHA;
    }
    
    public void setUSU_SENHA(String USU_SENHA) {
        this.USU_SENHA = USU_SENHA;
    }




}


