package com.aula01.CadastroDeNinjas.missoes;

import java.util.HashMap;
import java.util.Map;

public class CategoriaMissoes {
	
    private static final Map<String, int[]> categorias = new HashMap<>();

    static {
        categorias.put("Fácil", new int[]{7, 10});
        categorias.put("Normal", new int[]{4, 6});
        categorias.put("Médio", new int[]{1, 3});
        categorias.put("Difícil", new int[]{0, 0});
    }

    public static boolean podeAceitarMissao(int rank, String categoria, int rankTotalEquipe) {
        int[] limites = categorias.getOrDefault(categoria, new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE});
        return (rank >= limites[0] && rank <= limites[1]) || rankTotalEquipe >= (limites[0] * 2);
    }
}

