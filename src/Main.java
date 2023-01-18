public class Main {
    public static void main(String[] args) {

        Auxiliar auxiliar = new Auxiliar();
        int num = 0;
       int result = 0;
        while (num < 1000){

        result = result + auxiliar.calc(num);

            System.out.println("N:" + num);
            System.out.println("R: " + result);
        num+=1;





        }
        System.out.println("Final Result: " + result);
    }
}