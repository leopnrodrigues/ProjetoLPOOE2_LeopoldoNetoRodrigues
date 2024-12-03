/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Table;
/**
 *
 * @author leo
 */
@Entity
@DiscriminatorValue("MOTORISTA")
//@Table(name = "tb_motorista")
public class Motorista extends Pessoa {
    @Column(nullable = true, length = 9)
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }   
}
