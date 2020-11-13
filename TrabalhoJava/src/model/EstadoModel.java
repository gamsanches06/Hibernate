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
@Table(name = "ESTADO")
public class EstadoModel implements java.io.Serializable {

    @Id
    @Column(name = "EST_ID", nullable = false, precision = 10, scale = 0)
    private int EST_ID;

    @Column(name = "EST_NOME", nullable = false, length = 60)
    private String EST_NOME;

    public EstadoModel() {
    }

    public EstadoModel(int EST_ID, String EST_NOME) {
        this.EST_ID = EST_ID;
        this.EST_NOME = EST_NOME;
    }

    public int getEST_ID() {
        return EST_ID;
    }

    public void setEST_ID(int EST_ID) {
        this.EST_ID = EST_ID;
    }

    public String getEST_NOME() {
        return EST_NOME;
    }

    public void setEST_NOME(String EST_NOME) {
        this.EST_NOME = EST_NOME;
    }
}
