package Classes;

public class Main {

    public static void main(String[] args) {

        Factorisation A = new Factorisation(1);

//        System.out.println("Primefactors of 44");
//        for (Integer integer : A.primeFactors(44)) {
//            System.out.println(integer);
//        }
//        System.out.println("Primefactors of 3");
//        for (Integer integer : A.primeFactors(3)) {
//            System.out.println(integer);
//        }
        System.out.println("Primefactors of 32");
        for (Integer integer : A.primeFactors()) {
            System.out.println(integer);
        }
    }
}
