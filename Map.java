
package brickBracker;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Map 
{
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    public Map(int r,int c)
    {
        map = new int [r][c];
        for (int[] map1 : map) {
            for (int j = 0; j<map[0].length; j++) {
                map1[j] = 1;
            }
        }
        brickWidth=540/c;
        brickHeight=150/r;
    }
    public void draw(Graphics2D g)
    {
        for(int i=0;i<map.length;i++)
        {
            for(int j=0;j<map[0].length;j++)
            {
                if(map[i][j]>0)
                {
                    g.setColor(Color.orange);
                    g.fillRect(j*brickWidth+80,i*brickHeight+50,brickWidth,brickHeight);
                    
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j*brickWidth+80,i*brickHeight+50,brickWidth,brickHeight);
                    
                }
            }
        }
    }
    public void setBrickValue(int value,int r,int c)
    {
        map[r][c]= value;
    } 
}
