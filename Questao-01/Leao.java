public class Leao extends Animal {
    private boolean juba;

    public Leao(float tamanho, String cor, boolean juba) {
        super(tamanho, cor);
        this.juba = juba;
    }

    public Leao() {
        super();
    }

    public boolean getJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public void cacar() {
        String vantagem = juba ? "Minha juba assusta as presas!" : "Caçando furtivamente...";
        System.out.println("[LEÃO] Rugindo! " + vantagem);
    }

    @Override
    public void comer(String comida) {
        if ("leao".equalsIgnoreCase(comida)) {
            System.out.println("[LEÃO] Não como outros leões! (Canibalismo é errado)");
        } else {
            super.comer(comida);
            System.out.println("[LEÃO] *rasga a carne com os dentes*");
        }
    }

    @Override
    public String toString() {
        return String.format("Leão [Juba: %s | %s]",
                juba ? "Sim" : "Não", super.toString());
    }
}
