/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proses;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class background extends JPanel{
    private final Image bg;
    
    public background(){
        setOpaque(true);
        bg=new ImageIcon(getClass().getResource("/Image/Master-100.jpg")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(bg, 0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
