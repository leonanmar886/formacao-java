package exceptionsCourse.models;

import exceptionsCourse.exceptions.MyException;

public class Flow {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
//        try {
//            metodo2();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MyException("Deu ruim no método");
    }
}
