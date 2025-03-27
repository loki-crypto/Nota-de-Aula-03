public class Cavalo extends Animal {
    private String raca;

    public Cavalo(float tamanho, String cor, String raca) {
        super(tamanho, cor);
        this.raca = raca;
    }

    public Cavalo() {
        super();
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca != null && !raca.trim().isEmpty()) {
            this.raca = raca;
        }
    }

    public void fugir() {
        System.out.printf("[CAVALO %s] Galopando a 60km/h para escapar!\n", raca.toUpperCase());
    }

    @Override
    public void comer(String comida) {
        super.comer(comida);
        System.out.println("[CAVALO] *mastiga feliz*");
    }

    @Override
    public String toString() {
        return String.format("Cavalo [Raça: %s | %s]",
                raca != null ? raca : "Desconhecida", super.toString());
    }
}
