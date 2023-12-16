package com.luiznogueira.entidades;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Aluno {

    private final String nome;
    private final String matricula;
    private final DataNascimento dataNascimento;
    private final TurmaAno turmaAno;

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", turmaAno=" + turmaAno +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

}
