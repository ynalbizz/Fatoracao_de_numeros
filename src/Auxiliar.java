import java.util.ArrayList;
import java.util.List;
public class Auxiliar {
    List fatores = new ArrayList();
    List indices = new ArrayList();

    Auxiliar(){
    }
    public void calc(long x) {

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
            this.fatores.add(n);
            n++;
            this.indices.add(indiceAtual);

        }
    }


    public List getFatores() {
        return fatores;
    }

    public List getIndices() {
        return indices;
    }
public void getResults() {
    int i;
    for (i = 0; i < fatores.size() && i < indices.size(); i++){
        System.out.println(fatores.get(i)+"^"+indices.get(i));

    }


}

}
