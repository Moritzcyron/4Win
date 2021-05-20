
/**
 * Die Verwaltungsklasse der Schlange.
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
class SCHLANGE
{
    /** Darstellung des Kopfs. */
    KOPFSYMBOL kopf;
    /** Darstellung des Rumpfs */
    RUMPFSYMBOL [] rumpf;
    RANDSYMBOL 
    /**
     * Legt die Schlange an und stellt Anfangsposition und -bewgungsrichtung ein.
     * @param x: x-Koordinate der Startposition des Schlangenkopfs
     * @param y: y-Koordinate der Startposition des Schlangenkopfs
     * @param richtung: Startrichtung des Schlangenkopfs
     */
    SCHLANGE (int x, int y, char richtung)
    {
        kopf = new KOPFSYMBOL ();
        kopf. AusrichtungSetzen (richtung);
        kopf. PositionSetzen(x, y);
        rumpf = new RUMPFSYMBOL [5];
        for (int i = 0; i < rumpf. length; i++)
        {
            rumpf [i] = new RUMPFSYMBOL ();
        }
        switch (richtung)
        {
          case 'O':
            for (int i = 0; i < rumpf. length; i++)
            {
                rumpf [i]. PositionSetzen (x - (rumpf. length - i), y);
            }
            break;
          case 'N':
            for (int i = 0; i < rumpf. length; i++)
            {
                rumpf [i]. PositionSetzen (x, y + (rumpf. length - i));
            }
            break;
          case 'W':
            for (int i = 0; i < rumpf. length; i++)
            {
                rumpf [i]. PositionSetzen (x + (rumpf. length - i), y);
            }
            break;
          case 'S':
            for (int i = 0; i < rumpf. length; i++)
            {
                rumpf [i]. PositionSetzen (x, y - (rumpf. length - i));
            }
            break;
        }
        
    }
    
    /**
     * Bewegt die Schlange ein Feld in der eingestellten Richtung.
     */
    void Bewegen ()
    {
        int x, xalt;
        int y, yalt;
        x = kopf. XPositionGeben ();
        y = kopf. YPositionGeben ();
        xalt = x;
        yalt = y;
        switch (kopf. AusrichtungGeben())
        {
          case 'O':
            x += 1;
            break;
          case 'N':
            y -= 1;
            break;
          case 'W':
            x -= 1;
            break;
          case 'S':
            y += 1;
            break;
        }
        kopf. PositionSetzen (x, y);
        rumpf [0]. Entfernen ();
        for (int i = 0; i < rumpf. length - 1; i++)
        {
            rumpf [i] = rumpf [i + 1];
        }
        rumpf [rumpf. length - 1] = new RUMPFSYMBOL ();
        rumpf [rumpf. length - 1]. PositionSetzen (xalt, yalt);
    }
    
    /**
     * Setzt die Bewegunsrichtung der Schlange.
     * @param richtungNeu (neue) Bewegungsrichtung
     */
    void RichtungSetzen (char richtungNeu)
    {
        kopf. AusrichtungSetzen (richtungNeu);
    }

 int XPositionGeben (
 {
     return kopf.XpositionGeben ();
     
 }
 
 int YPositionGeben (
 {
     return kopf.YpositionGeben ();
     
 }
 
 
}
