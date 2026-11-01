package som;

public class Tambor implements EmissorDeSom {
    private String tamanho;
    private String marca;

    public Tambor(String tamanho, String marca) {
        this.tamanho = tamanho;
        this.marca = marca;
    }

    @Override
    public String emitirSom() {
        return "Tum Tum";
    }
}