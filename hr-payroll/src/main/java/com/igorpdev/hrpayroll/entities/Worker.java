package com.igorpdev.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String nome;
    private Double dailyIncome;

    public Worker() {
    }

    public Worker(long id, String nome, Double dailyIncome) {
        this.id = id;
        this.nome = nome;
        this.dailyIncome = dailyIncome;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDailyIncome() {
        return this.dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

}
