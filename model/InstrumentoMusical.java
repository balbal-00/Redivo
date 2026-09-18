package model;

public abstract class InstrumentoMusical {

    protected String nome;
    protected String material;
    protected boolean afinado;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
        this.afinado = false;
    }

    public abstract String tocar();

    public void afinar() {
        afinado = true;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Material: " + material);
        System.out.println("Afinado: " + afinado);
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isAfinado() {
        return afinado;
    }
}
