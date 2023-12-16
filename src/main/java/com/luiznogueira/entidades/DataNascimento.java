package com.luiznogueira.entidades;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DataNascimento {

    private final int dia;
    private final int mes;
    private final int ano;

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

}
