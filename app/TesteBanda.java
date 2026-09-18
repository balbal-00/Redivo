package app;

import java.util.ArrayList;
import java.util.List;

import model.Bateria;
import model.InstrumentoMusical;
import model.Violao;

public class TesteBanda {

    public static void main(String[] args) {

        Violao violao = new Violao("Violão", "Madeira", 6);
        Bateria bateria = new Bateria("Bateria", "Metal", 5);

        List<InstrumentoMusical> instrumentos = new ArrayList<>();

        instrumentos.add(violao);
        instrumentos.add(bateria);
        
        int quantidadeAfinados = 0;

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            System.out.println(instrumento.tocar());

            if (instrumento.isAfinado()) {
                quantidadeAfinados++;
            }
        }

        System.out.println("Quantidade de instrumentos afinados: "
                + quantidadeAfinados);


    }
}
