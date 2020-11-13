package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FORNECEDOR")
public class FornecedorModel implements java.io.Serializable{

    @Id
    @Column(name = "FORNEC_ID", nullable = false, precision = 10, scale = 0)
    private int FORNEC_ID;
    
    @Column (name = "FORNEC_NOME", nullable = false, length = 50)
    private String FORNEC_NOME;
    
    @Column (name = "FORNEC_RAZSOCIAL", length = 50)
    private String FORNEC_RAZSOCIAL;
    
    @Column (name = "FORNEC_EMAIL", length = 40)
    private String FORNEC_EMAIL;
    
    @Column (name = "FORNEC_CNPJ", nullable = false, length = 14)
    private String FORNEC_CNPJ;
    
    @Column (name = "FORNEC_DDD", precision = 2, scale = 0)
    private int FORNEC_DDD;
    
    @Column (name = "FORNEC_TELEFONE", precision = 8, scale = 0)
    private int FORNEC_TELEFONE;

    public FornecedorModel() {

    }

    public int getFORNEC_ID() {
        return FORNEC_ID;
    }

    public void setFORNEC_ID(int FORNEC_ID) {
        this.FORNEC_ID = FORNEC_ID;
    }

    public String getFORNEC_NOME() {
        return FORNEC_NOME;
    }

    public void setFORNEC_NOME(String FORNEC_NOME) {
        this.FORNEC_NOME = FORNEC_NOME;
    }

    public String getFORNEC_RAZSOCIAL() {
        return FORNEC_RAZSOCIAL;
    }

    public void setFORNEC_RAZSOCIAL(String FORNEC_RAZSOCIAL) {
        this.FORNEC_RAZSOCIAL = FORNEC_RAZSOCIAL;
    }

    public String getFORNEC_CNPJ() {
        return FORNEC_CNPJ;
    }

    public void setFORNEC_CNPJ(String FORNEC_CNPJ) {
        this.FORNEC_CNPJ = FORNEC_CNPJ;
    }

    public int getFORNEC_DDD() {
        return FORNEC_DDD;
    }

    public void setFORNEC_DDD(int FORNEC_DDD) {
        this.FORNEC_DDD = FORNEC_DDD;
    }

    public int getFORNEC_TELEFONE() {
        return FORNEC_TELEFONE;
    }

    public void setFORNEC_TELEFONE(int FORNEC_TELEFONE) {
        this.FORNEC_TELEFONE = FORNEC_TELEFONE;
    }

    public String getFORNEC_EMAIL() {
        return FORNEC_EMAIL;
    }

    public void setFORNEC_EMAIL(String FORNEC_EMAIL) {
        this.FORNEC_EMAIL = FORNEC_EMAIL;
    }

    

   
}