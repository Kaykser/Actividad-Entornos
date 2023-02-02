package exercici.pkg1;

import Vista.Ventana;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Exercici1 {

    public static void main(String[] args) {

        try { // posa el LAF del sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });

    }

}
