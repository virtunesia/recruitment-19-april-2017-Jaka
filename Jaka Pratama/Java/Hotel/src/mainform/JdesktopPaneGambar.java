/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainform;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
 
/**
 *
 * @author Ahmad Jamal
 */
public class JdesktopPaneGambar extends JDesktopPane {
 
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
 
        Image img = new ImageIcon(getClass().getResource("")).getImage();
 
        graphics.drawImage(img, 0, 0, getWidth(), getHeight(), null);
 
 
        graphics.dispose();
    }
}