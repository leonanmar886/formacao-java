package exceptionsCourse.models;

import exceptionsCourse.exceptions.MyExceptionChecked;
import exceptionsCourse.exceptions.MyExceptionUnchecked;

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
        throw new MyExceptionUnchecked("Deu ruim no método");
    }

    private static void metodo3() throws MyExceptionChecked {
        System.out.println("Ini do metodo3");
        throw new MyExceptionChecked("Deu ruim no método");
    }
}
