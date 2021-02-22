
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{     
    int s=40;
   
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
     parallelen();
     for(int i = 0; i < 9; i++) {
        if (i<=3){
            moduloplus(i);
        }
        else if(3 < i && i<=5){ 
            modulominus(i);
        }
        else{
            moduloplus(i);
        }
        
        }
    }
     public void moduloplus(int i){
    
        int modulo = i % 3;
         zeichneQuadrate(modulo * 10,i*40);
    
    
    }
     public void modulominus(int i){
    
        int modulo = -1*(i % 3);
         zeichneQuadrate(modulo * 10+10,i*40);
    
    
    }   
    public void parallelen()
    {
        for(int i = 0; i < 10; i++) {
         line(0,10+i*40,640,10+i*s);
         
        }   
    
    }
     
    public void zeichneQuadrate(int shiftx,int shifty)
    {
        fill(0);
        for(int i = 0; i < 10; i++) {
         square(shiftx +10+i*s*2,shifty + 10,s);
         
        }  
    
    }
    
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
