package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
@SecondaryTable(name = "ENDERECO")
public class ClienteModel implements java.io.Serializable {

    @Id
    @Column(name = "CLIE_ID", nullable = false, precision = 10, scale = 0)
    private int CLIE_ID;

    @Column(name = "CLIE_NOME", nullable = false, length = 30)
    private String CLIE_NOME;

    @Column(name = "CLIE_CPF", nullable = false, length = 11)
    private String CLIE_CPF;

    @Column(name = "CLIE_EMAIL", length = 30)
    private String CLIE_EMAIL;

    @Column(name = "CLIE_DDD", precision = 2)
    private int CLIE_DDD;

    @Column(name = "CLIE_TELEFONE", precision = 8)
    private int CLIE_TELEFONE;
    
    @Column(table = "ENDERECO")
    private EnderecoModel Endereco;

    public ClienteModel() {
    }

    public ClienteModel(int CLIE_ID, String CLIE_NOME, String CLIE_CPF, String CLIE_EMAIL, int CLIE_DDD, int CLIE_TELEFONE) {
        this.CLIE_ID = CLIE_ID;
        this.CLIE_NOME = CLIE_NOME;
        this.CLIE_CPF = CLIE_CPF;
        this.CLIE_EMAIL = CLIE_EMAIL;
        this.CLIE_DDD = CLIE_DDD;
        this.CLIE_TELEFONE = CLIE_TELEFONE;
    }

    public int getCLIE_ID() {
        return CLIE_ID;
    }

    public void setCLIE_ID(int CLIE_ID) {
        this.CLIE_ID = CLIE_ID;
    }

    public String getCLIE_NOME() {
        return CLIE_NOME;
    }

    public void setCLIE_NOME(String CLIE_NOME) {
        this.CLIE_NOME = CLIE_NOME;
    }

    public String getCLIE_CPF() {
        return CLIE_CPF;
    }

    public void setCLIE_CPF(String CLIE_CPF) {
        this.CLIE_CPF = CLIE_CPF;
    }

    public String getCLIE_EMAIL() {
        return CLIE_EMAIL;
    }

    public void setCLIE_EMAIL(String CLIE_EMAIL) {
        this.CLIE_EMAIL = CLIE_EMAIL;
    }

    public int getCLIE_DDD() {
        return CLIE_DDD;
    }

    public void setCLIE_DDD(int CLIE_DDD) {
        this.CLIE_DDD = CLIE_DDD;
    }

    public int getCLIE_TELEFONE() {
        return CLIE_TELEFONE;
    }

    public void setCLIE_TELEFONE(int CLIE_TELEFONE) {
        this.CLIE_TELEFONE = CLIE_TELEFONE;
    }


}
