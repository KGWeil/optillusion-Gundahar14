
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2.
 * Beschreibung: 
 *
 * @author (Philipp Spohn) 
 * @version (9.3.2021)
 */
public class Wellen2 extends PApplet
{       
    int länge = 120;
    int längeQuadrat =50;
    int abstand= 10;
    
    @Override
    public void settings()
    {
        
        size(1200,1200);
    }        

    @Override
    public void setup()
    {

    }

    @Override
    public void draw()
    {
        background(255);
        Quadrate();
    }

    public void Quadrate()
    {
        for(int Spalten=0;Spalten<6;Spalten++){
            for(int Zeilen=0;Zeilen<6;Zeilen++){
                Block(Spalten,Zeilen);
            }    
        }
    }

    public void Block(int Spalten,int Zeilen){
        for(int i=1;i<3;i++)
        {
            for(int j=1;j<3;j++)
            {
                if(j==i){
                    fill(73, 245, 54);
                    square(-40+j*60,-40+i*60,längeQuadrat+10);
                    fill(255);
                    square(-35+j*60,-35+i*60,längeQuadrat);
                }
                else{
                    fill(73, 245, 54);
                    square(-35+j*60,-35+i*60,längeQuadrat);
                }
            }
        }
    }

      public static void main(String _args[]){ 
          PApplet.main(new String[] {Wellen2.class.getName() });
    }
}
