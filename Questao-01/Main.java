public class Main {
    public static void main(String[] args) {
        Leao leo = new Leao(120, "marrom", true);
        Cavalo horse = new Cavalo(160, "branco", "Arabian");

        System.out.println("=== ANIMAIS CRIADOS ===");
        System.out.println(leo);
        System.out.println(horse);

        System.out.println("\n=== INTERAÇÕES ===");
        horse.comer("Feno");
        leo.cacar();
        horse.fugir();
        leo.comer("Cavalo");
        leo.comer("Leao");  
    }
}
