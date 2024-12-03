/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.OneToMany;

/**
 *
 * @author leo
 */
@Entity
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Pessoa {
    @Enumerated(EnumType.STRING)
    private Turno turno;
    private int cabine;
    
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getCabine() {
        return cabine;
    }

    public void setCabine(int cabine) {
        this.cabine = cabine;
    }
    
    
}
