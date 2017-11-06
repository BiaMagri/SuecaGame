
package sueca;

import Model.JogoControl;
import View.CadastroFrame;
import View.InicioFrame;
import View.JogoFrame;
import java.util.HashMap;

public class Sueca {

    public static void main(String[] args) {
        
        JogoControl jogo = new JogoControl();
        
        InicioFrame inif = new InicioFrame(jogo);
        inif.setVisible(true);
        inif.setLocationRelativeTo(null);
    }
    
}
