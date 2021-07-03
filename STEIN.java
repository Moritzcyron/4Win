import java.awt.*;
import javax. swing. *;
class STEIN
{
    private JFrame fenster;
    
    private static final int groesse = 60;

    private JComponent anzeige;

    STEIN(int x, int y)
    {
        fenster = FENSTER. FensterGeben ();
        anzeige = new JComponent () {
            public void paintComponent (Graphics g)
            {
                g. clearRect (0, 0, groesse, groesse);
                g. setColor (Color. yellow);
                g. fillRect (0, 0, groesse, groesse);
            }

        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        
        fenster. add (anzeige, 0);
        
        PositionSetzen (x, y);
    }

    public void PositionSetzen (int x, int y)
    {
        anzeige. setLocation (100 * x, 100 * y);
    }

    /**
     * Entfernt die Figur aus der Anzeige
     */
    public void Entfernen ()
    {
        (FENSTER. FensterGeben ()). remove (anzeige);
        (FENSTER. FensterGeben ()). repaint();
    }
}