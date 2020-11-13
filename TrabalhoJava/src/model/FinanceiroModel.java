/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Giovani
 */
@Entity
@Table(name = "FINANCEIRO")
public class FinanceiroModel implements java.io.Serializable{

    @Id
    @Column(name = "FIN_ID", nullable = false, precision = 10, scale = 0)
    private int FIN_ID;
    
    @Column (name = "FIN_NUMERO", nullable = false, precision = 10, scale = 0)
    private int FIN_NUMERO;
    
    @Column (name = "FIN_EMISSAO", nullable = false, length = 10)
    private String FIN_EMISSAO;
    private String FIN_VENCIMENTO;
    private String FIN_PAGAMENTO;
    private float FIN_VALOR;
    private float FIN_JUROS;
    private float FIN_MULTA;
    private float FIN_DESCONTO;
    private float FIN_TOTAL;

    public FinanceiroModel() {
    }

    public int getFIN_ID() {
        return FIN_ID;
    }

    public void setFIN_ID(int FIN_ID) {
        this.FIN_ID = FIN_ID;
    }

    public int getFIN_NUMERO() {
        return FIN_NUMERO;
    }

    public void setFIN_NUMERO(int FIN_NUMERO) {
        this.FIN_NUMERO = FIN_NUMERO;
    }

    public String getFIN_EMISSAO() {
        return FIN_EMISSAO;
    }

    public void setFIN_EMISSAO(String FIN_EMISSAO) {
        this.FIN_EMISSAO = FIN_EMISSAO;
    }

    public String getFIN_VENCIMENTO() {
        return FIN_VENCIMENTO;
    }

    public void setFIN_VENCIMENTO(String FIN_VENCIMENTO) {
        this.FIN_VENCIMENTO = FIN_VENCIMENTO;
    }

    public String getFIN_PAGAMENTO() {
        return FIN_PAGAMENTO;
    }

    public void setFIN_PAGAMENTO(String FIN_PAGAMENTO) {
        this.FIN_PAGAMENTO = FIN_PAGAMENTO;
    }

    public float getFIN_VALOR() {
        return FIN_VALOR;
    }

    public void setFIN_VALOR(float FIN_VALOR) {
        this.FIN_VALOR = FIN_VALOR;
    }

    public float getFIN_JUROS() {
        return FIN_JUROS;
    }

    public void setFIN_JUROS(float FIN_JUROS) {
        this.FIN_JUROS = FIN_JUROS;
    }

    public float getFIN_MULTA() {
        return FIN_MULTA;
    }

    public void setFIN_MULTA(float FIN_MULTA) {
        this.FIN_MULTA = FIN_MULTA;
    }

    public float getFIN_DESCONTO() {
        return FIN_DESCONTO;
    }

    public void setFIN_DESCONTO(float FIN_DESCONTO) {
        this.FIN_DESCONTO = FIN_DESCONTO;
    }

    public float getFIN_TOTAL() {
        return FIN_TOTAL;
    }

    public void setFIN_TOTAL(float FIN_TOTAL) {
        this.FIN_TOTAL = FIN_TOTAL;
    }

    
    
    
    
}
