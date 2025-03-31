

package testGIT;
import javax.swing.JOptionPane;
public class test {

    public static void main(String[] args) {
   
        String nomes[] = new String[3];
        nomes[0] = "Unisul";
        nomes[1] = "Aluno";
        nomes[2] = "Sistema";
        
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "o nome na posição " + i + " é " + nomes[i]);
        }
        
        
    }
}
