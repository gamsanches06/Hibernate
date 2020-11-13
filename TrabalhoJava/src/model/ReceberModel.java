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
public class ReceberModel {

    private int REC_ID;
    private int REC_CLIEIDFK;
    private int REC_FINIDFK;
    private String REC_NFE;

    public ReceberModel() {
    }

    public int getREC_ID() {
        return REC_ID;
    }

    public void setREC_ID(int REC_ID) {
        this.REC_ID = REC_ID;
    }

    public int getREC_CLIEIDFK() {
        return REC_CLIEIDFK;
    }

    public void setREC_CLIEIDFK(int REC_CLIEIDFK) {
        this.REC_CLIEIDFK = REC_CLIEIDFK;
    }

    public int getREC_FINIDFK() {
        return REC_FINIDFK;
    }

    public void setREC_FINIDFK(int REC_FINIDFK) {
        this.REC_FINIDFK = REC_FINIDFK;
    }

    public String getREC_NFE() {
        return REC_NFE;
    }

    public void setREC_NFE(String REC_NFE) {
        this.REC_NFE = REC_NFE;
    }

}
