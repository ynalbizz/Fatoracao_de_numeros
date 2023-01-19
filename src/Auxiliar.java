import java.util.ArrayList;
import java.util.List;
public class Auxiliar {
    List<Integer> fatores = new ArrayList<>();
    List<Integer> indices = new ArrayList<>();

    String[] resultArr;

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

/*
    public List getFatores() {
        return fatores;
    }

    public List getIndices() {
        return indices;
    }
*/
    public String[] getResultArr(){
        return resultArr;
    }

    public void getResults() {
        int p = indices.size();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < p ; i++){
            result.add("  " + fatores.get(i) + "^" + indices.get(i) + "  ");

        }

        int n = result.size(); //fetching list size
        String[] resultArr = new String[n]; //new int array of given size
        for(int i=0;i<n;i++){ //looping over each element and adding them to array
            resultArr[i] = result.get(i);
        }
        this.resultArr = resultArr;
    }

}
