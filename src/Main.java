public class Main {
    public static void main(String[] args) {

        Auxiliar auxiliar = new Auxiliar();

        boolean result = false;
        result = auxiliar.calc();

        System.out.println("Final Result: " + auxiliar.getResult());
    }
}