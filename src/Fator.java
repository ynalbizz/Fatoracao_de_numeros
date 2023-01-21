public class Fator {

    long fator;
    byte indice;

    public Fator(long fator, byte indice) {
        this.fator = fator;
        this.indice = indice;
    }

    @Override
    public String toString() {
        return fator + "^" + indice;
    }
}
