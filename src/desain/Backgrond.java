/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desain;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Backgrond extends JPanel{
    private Image game;
    
    public Backgrond(){
        setOpaque(true);
        game=new ImageIcon(getClass().getResource("/images/background.jpg")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(game, 0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
