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
@Table(name = "ENDERECO_CLIENTE")
public class EnderecoClienteModel {

    @Id
    @Column(name = "END_ID", nullable = false, precision = 10, scale = 0)
    private int END_ID;

    @Column(name = "END_ESTADOFK", precision = 10)
    private int END_ESTADOFK;

    @Column(name = "END_LOGRADOURO", length = 40)
    private String END_LOGRADOURO;

    @Column(name = "END_CIDADE", length = 40)
    private String END_CIDADE;

    @Column(name = "END_TIPO", length = 20)
    private String END_TIPO;

    @Column(name = "END_CLIEFK", precision = 10)
    private int END_CLIEFK;


    public EnderecoClienteModel() {
    }

    public int getEND_ESTADOFK() {
        return END_ESTADOFK;
    }

    public void setEND_ESTADOFK(int END_ESTADOFK) {
        this.END_ESTADOFK = END_ESTADOFK;
    }

    public int getEND_ID() {
        return END_ID;
    }

    public void setEND_ID(int END_ID) {
        this.END_ID = END_ID;
    }

    public String getEND_LOGRADOURO() {
        return END_LOGRADOURO;
    }

    public void setEND_LOGRADOURO(String END_LOGRADOURO) {
        this.END_LOGRADOURO = END_LOGRADOURO;
    }

    public String getEND_CIDADE() {
        return END_CIDADE;
    }

    public void setEND_CIDADE(String END_CIDADE) {
        this.END_CIDADE = END_CIDADE;
    }

    public String getEND_TIPO() {
        return END_TIPO;
    }

    public void setEND_TIPO(String END_TIPO) {
        this.END_TIPO = END_TIPO;
    }

    public int getEND_CLIEFK() {
        return END_CLIEFK;
    }

    public void setEND_CLIEFK(int END_CLIEFK) {
        this.END_CLIEFK = END_CLIEFK;
    }


}
