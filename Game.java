package brickBracker;
import java.awt.PopupMenu;
import javax.swing.JFrame;



public class Game {

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        JFrame obj=new JFrame();
        Gameplay gamePlay=new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout Bricks");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);
        
        
    }

    
    
}