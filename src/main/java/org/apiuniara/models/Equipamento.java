package org.apiuniara.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Equipamento {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private boolean disponivel;

    private LocalDateTime date_hour;

    public LocalDateTime getDate_hour() {
        return date_hour;
    }

    public void setDate_hour(LocalDateTime date_hour) {
        this.date_hour = date_hour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
