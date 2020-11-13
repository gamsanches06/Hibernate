/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Giovani
 */
public class PagarModel {
    private int PAG_ID;
    private String PAG_BOLETO;
    private int PAG_FINIDFK;
    private int PAG_FORNECIDFK; 
    

    public PagarModel() {
    }

    public int getPAG_ID() {
        return PAG_ID;
    }

    public void setPAG_ID(int PAG_ID) {
        this.PAG_ID = PAG_ID;
    }

    public String getPAG_BOLETO() {
        return PAG_BOLETO;
    }

    public void setPAG_BOLETO(String PAG_BOLETO) {
        this.PAG_BOLETO = PAG_BOLETO;
    }

    public int getPAG_FINIDFK() {
        return PAG_FINIDFK;
    }

    public void setPAG_FINIDFK(int PAG_FINIDFK) {
        this.PAG_FINIDFK = PAG_FINIDFK;
    }

    public int getPAG_FORNECIDFK() {
        return PAG_FORNECIDFK;
    }

    public void setPAG_FORNECIDFK(int PAG_FORNECIDFK) {
        this.PAG_FORNECIDFK = PAG_FORNECIDFK;
    }

}
