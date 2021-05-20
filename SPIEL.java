
import java. awt. event. *;

/**
 * Rahmenklasse des Spiels.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class SPIEL extends SIMULATION
{
    /** Die Schlange. */
    SCHLANGE schlange;
    
    /**
     * Baut die Basiselemente auf.
     */
    SPIEL ()
    {
        schlange = new SCHLANGE (0, 0, 'O');
    }
    
    /**
     * Bewegt die Schlange.
     */
    void TaktImpulsAusfuehren ()
    {
        schlange. Bewegen ();
    }
    
    /**
     * Wertet die Tasteneingaben aus.
     * @param welche Tastencode
     */
    void TasteGedrueckt (char welche)
    {
        switch (welche)
        {
          case 'S':
          case 's':
            Starten ();
            break;
          case 'P':
          case 'p':
            Anhalten ();
            break;
          case KeyEvent. VK_DOWN:
          case KeyEvent. VK_KP_DOWN:
            schlange. RichtungSetzen ('S');
            break;
          case KeyEvent. VK_LEFT:
            schlange. RichtungSetzen ('W');
            break;
          case KeyEvent. VK_RIGHT:
            schlange. RichtungSetzen ('O');
            break;
          case KeyEvent. VK_UP:
            schlange. RichtungSetzen ('N');
            break;
          default:
            //System. out. println ("Taste: " + (0 + (int) welche));
        }
    }
}
