package model;

public class Violao extends InstrumentoMusical {

    private int quantidadeCordas;

    public Violao(String nome, String material, int quantidadeCordas) {
        super(nome, material);
        this.quantidadeCordas = quantidadeCordas;
    }

    @Override
    public String tocar() {
        return "Som de cordas dedilhadas.";
    }

    public int getQuantidadeCordas() {
        return quantidadeCordas;
    }
}
