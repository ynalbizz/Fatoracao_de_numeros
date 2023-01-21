import java.util.ArrayList;

public class CalculaFatores {
    public static ArrayList<Fator> calc(long x) {
        ArrayList<Fator> fatores = new ArrayList<>();
        int numerador = 2;
        while (x != 1) {
            byte indiceAtual = 0;

            while (x % numerador != 0) {
                numerador++;
            }

            while (x % numerador == 0) {
                x = x / numerador;
                indiceAtual += 1;
            }
            Fator fator = new Fator(numerador,indiceAtual);
            fatores.add(fator);

            numerador++;
        }
        return fatores;
    }

}
