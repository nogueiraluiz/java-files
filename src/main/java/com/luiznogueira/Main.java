package com.luiznogueira;

import com.luiznogueira.entidades.Aluno;
import com.luiznogueira.entidades.DataNascimento;
import com.luiznogueira.entidades.TurmaAno;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = Aluno.builder()
                .nome("Lucas Silva")
                .matricula("20100001")
                .dataNascimento(DataNascimento.builder()
                        .dia(1)
                        .mes(1)
                        .ano(2000)
                        .build())
                .turmaAno(TurmaAno.builder()
                        .ano(3)
                        .turma('A')
                        .build())
                .build();
        System.out.println(aluno);
    }
}
