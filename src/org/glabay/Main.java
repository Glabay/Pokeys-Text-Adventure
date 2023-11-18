package org.glabay;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.glabay.gui.MainFrame;

/**
 *
 * @author Michael Glabay
 * @since Oct 27, 2014
 */
public class Main implements Runnable {

    
    public static void main(String args[]) {
        Main main = new Main();
        String lnfName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        try {
            UIManager.setLookAndFeel(lnfName);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
        main.run();
    }

    @Override
    public void run() {
        init();
    }
    
    private void init() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
