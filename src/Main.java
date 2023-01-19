import javax.swing.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();

        String numString = JOptionPane.showInputDialog("title");
        long num = Integer.parseInt(numString);
        //long num = 13195;
        aux.calc(num);
        aux.getResults();
        String[] result = aux.getResultArr();
        JOptionPane.showMessageDialog(null, Arrays.toString(result));


    }
}