public class Animal {
    protected float tamanho;
    protected String cor;

    public Animal(float tamanho, String cor) {
        setTamanho(tamanho);
        setCor(cor);
    }

    public Animal() {
        this.tamanho = 0;
        this.cor = "Indefinida";
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        if (tamanho >= 0) {
            this.tamanho = tamanho;
        } else {
            System.out.println("[ERRO] Tamanho não pode ser negativo!");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null && !cor.trim().isEmpty()) {
            this.cor = cor.trim();
        }
    }

    public void comer(String comida) {
        System.out.printf("Que gostoso(a).. %s!\n", comida != null ? comida : "nada");
    }

    @Override
    public String toString() {
        return String.format("Tamanho: %.1fcm | Cor: %s", tamanho, cor);
    }
}
