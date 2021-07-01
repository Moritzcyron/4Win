import java. awt. *;
import javax. swing. *;  

public class FENSTER
{
    int rasterGroesse = 100;
    
    int hoeheFenster = rasterGroesse*8;
    
    int breiteFenster = rasterGroesse*8;
    
    String titelFenster = "4 Gewinnt";
    
    Color Hintergrund = new Color (255, 255, 255);
    
    Color farbeStreifen = new Color (0, 0, 0); 
    
    JFrame fenster = null;
    
    public FENSTER(){
        fenster = new JFrame (titelFenster);
        fenster. setResizable (false);
        fenster. setVisible (true);
        fenster. setLayout (null);
        fenster. getContentPane (). setBackground (Hintergrund);
        Insets i = fenster.getInsets();
        fenster. setSize (breiteFenster, hoeheFenster + i.top);
        
        fenster. setSize (breiteFenster, hoeheFenster);
        JComponent hintergrund = new JComponent ()
        {
            public void paintComponent (Graphics g)
            {
            for (int x = 0; x <= breiteFenster; x = x + rasterGroesse)
                for (int y = 0; y <= hoeheFenster; y = y + rasterGroesse)
                    g.drawRect(x, y, 60,60);
            }
        };
        hintergrund. setVisible (true);
        hintergrund. setSize (breiteFenster, hoeheFenster);
        hintergrund. setLocation (0, 0);
        fenster. add (hintergrund);
    }
    
}
