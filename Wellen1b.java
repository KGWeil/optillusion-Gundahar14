
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1b.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1b extends PApplet
{       
    int s = 100;
    int länge = 8;

    @Override
    public void settings()
    {
        size(800,400);

    }        

    @Override
    public void setup()
    {
        zeichneQuadrate();
    }

    public void zeichneQuadrate()
    {
        
        int c = 0;   //Für die Punkte
        for(int i=0;i<4;i++)
        {

            c=i%2;
            for(int k=0;k<8;k++){
               zeichneQuadrat(k*s,i*s,255,false); 
            }
        }
    }

    public void zeichneQuadrat(int x, int y, int farbe, boolean links){
        fill(farbe);
        square(x,y,s);
        farbe=255-farbe;
        fill(farbe);
        if(links){

            circle(x+10,y+10,10);
            circle(x+10,y+90,10);

        }
        else{

            circle(x+10,y+10,10);
            circle(x+10,y+90,10);   

        }
        //h=i/länge;

    }

    @Override
    public void draw()
    {

    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1b.class.getName() });
    }

}
