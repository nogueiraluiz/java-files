package com.luiznogueira.entidades;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TurmaAno {

    private final int ano;
    private final char turma;

    @Override
    public String toString() {
        return ano + "-" + turma;
    }
}