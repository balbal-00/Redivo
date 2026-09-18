package model;

public class Bateria extends InstrumentoMusical {

    private int quantidadeTambores;

    public Bateria(String nome, String material, int quantidadeTambores) {
        super(nome, material);
        this.quantidadeTambores = quantidadeTambores;
    }

    @Override
    public String tocar() {
        return "Som grave de batidas.";
    }

    public int getQuantidadeTambores() {
        return quantidadeTambores;
    }
}
