public class Auxiliar {

    private long results;
    Auxiliar(){
    }
    public boolean calc() {

        int termo1 = 1;
        int termo2 = 1;
        int i = 1;
        int resultado = 0;
        while (termo2 + termo1 < 4000000) {
            resultado = termo1 + termo2;
            termo1 = termo2;
            termo2 = resultado;
            i++;
            System.out.println(i);

            if (resultado % 2 == 0) {
                this.results = this.results + resultado;
            }

        }

        return true;
    }
    public long getResult() {
        return results;
    }
}
