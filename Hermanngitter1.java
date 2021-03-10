import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermanngitter1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter1 extends PApplet
{      
    int abstand = 60;
    int länge = 50;
    int H = 0;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
        
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
       background(250); 
       int shiftdown = 0;
       for (int i=0; i<=6;i++){
       quadrateRow(shiftdown);
       shiftdown = shiftdown + abstand;
       }
    }
    
    public void quadrateRow(int shiftdown)
    {
       fill(255);
       for (int i = 0; i<=7;i++ )
        {
            
            square(10+abstand*i,shiftdown+abstand,länge);
            //for (int H = 0;i > 7; H++){
            
            //}
            
       }    
        
        
    }
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermanngitter1.class.getName() });
    }

}
