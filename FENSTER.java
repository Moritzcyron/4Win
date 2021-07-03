import java. awt. *;
import javax. swing. *;  

public class FENSTER
{
    int rasterGroesse = 100;
    
    int hoeheFenster = rasterGroesse*8;
    
    int breiteFenster = rasterGroesse*8;
    
    String titelFenster = "4 Gewinnt";
    
    Color Hintergrund = new Color (255, 255, 255); 
    
    static JFrame fenster = null;
    
    public static FENSTER f= null;
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
        //Bis hier wurden Werte für den JFrame definiert
        
        {
            public void paintComponent (Graphics g)
            {
            for (int x = 0; x <= breiteFenster; x = x + rasterGroesse)
                for (int y = 0; y <= hoeheFenster; y = y + rasterGroesse)
                    g.drawRect(x, y, 60,60);
            }
        };
        //Hier wurde das Hintergrundmuster definiert
        
        hintergrund. setVisible (true);
        hintergrund. setSize (breiteFenster, hoeheFenster);
        hintergrund. setLocation (0, 0);
        fenster. add (hintergrund);
        //Hier wurde das Hintergrundmuster auf den JFrame hinzugefügt
    }
    
    static JFrame FensterGeben(){
            if (f == null)
        {
            f = new FENSTER();
        }
        return f. fenster;
    }
}
