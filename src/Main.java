import javax.swing.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        String numString = JOptionPane.showInputDialog("Input a NUMBER");
        long num = Long.parseLong(numString);
        //long num = 13195;
        ArrayList<Fator> fatores = CalculaFatores.calc(num);

        JOptionPane.showMessageDialog(null, fatores);
=======
        Auxiliar auxiliar = new Auxiliar();
        auxiliar.calc(13124156);
        auxiliar.getResults();
>>>>>>> master
    }
}