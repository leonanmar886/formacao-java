package exceptions;

public class Flow {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (Exception e) {
            System.out.println("Arithmetic exception");
        }

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int j = 1; j <= 5; j++) {
            System.out.println(j);
            int a = 4 /0;
        }
        System.out.println("Fim do metodo2");
    }
}
