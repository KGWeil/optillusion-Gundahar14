
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: Hier sollen mehrere vorgegebene Figuren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1500, 1500); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {

         rect(250, 250, 50, 50);
        ellipse(500, 300,40, 40);
        ellipse(500, 300,30, 30);
        ellipse(500, 300,20, 20);
         rect(250, 250, 50, 50);
        ellipse(500, 0,40, 40);
        ellipse(500, 0,30, 30);
        ellipse(500, 0,20, 20);


        // ***** hier kommen deine Anweisungen hin ************

        // ***** Ende der eigenen Anweisungen **********

        ellipse(500, 125, 60, 60);
        rect(475, 275, 50, 50);
        rect(480, 105, 40,40);
        rect(485, 110, 30,30);
        rect(490, 115, 20,20);
        ellipse(500, 300, 40,40);
        ellipse(500,300, 30, 30);
        ellipse(500,300, 20, 20);

    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    public void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************

        // ***** Ende der eigenen Anweisungen **********  
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
        // zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
