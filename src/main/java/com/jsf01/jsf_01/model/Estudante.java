package com.jsf01.jsf_01.model;

import com.jsf01.jsf_01.enuns.Turno;

import javax.inject.Named;

public class Estudante {
    private String name = "Evandro";
    private String sobrenome = "Cunha";
    private double nota1;
    private double nota2 = 33;
    private double nota3 = 44;
    private Turno turno = Turno.NOTURNO;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
