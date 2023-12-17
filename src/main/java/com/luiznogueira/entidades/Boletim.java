package com.luiznogueira.entidades;

import java.util.Map;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Boletim {

    private final Map<String, List<Integer>> notas;
    private final float media = 0f;

}
