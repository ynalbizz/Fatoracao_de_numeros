import java.util.ArrayList;
import java.util.List;
public class Auxiliar {

    Auxiliar(){
    }
    public void calc(long x) {
        List fatores = new ArrayList();
        List indices = new ArrayList();
        int n = 2;
        while (x != 1) {


            while (x % n != 0) {
                n++;
            }

            int indiceAtual = 0;
            while (x % n == 0) {
                x = x / n;
                indiceAtual += 1;
            }
            fatores.add(n);
            n++;
            indices.add(indiceAtual);
            System.out.println(fatores);
            System.out.println(indices);

        }
    }
}
