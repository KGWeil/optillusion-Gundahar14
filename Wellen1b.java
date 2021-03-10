
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
    //int shift = -200;
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
        int A=0;//farbe der quadrate
        int B=0;//seite der kreise
        int c = 0;//modulo 1
        int d = 0;//modulo 2
        fill(122, 235, 66);
        line(100,100,700,100);
        fill(122, 235, 66);
        line(100,300,700,300);
        for(int i=0;i<4;i++)
        {
            c=i%2;
            if(c==0){
                B = 1;

            }
            else{
                B = 0;

            }    
            for(int j=0;j<13;j++){
                d =j%2;
                if(d==0){
                    A = 255;  
                    if(c==0){
                        A = 0;
                    }
                }
                else{
                    A = 0;  
                    if(c==0){
                        A = 255;
                    }
                }
                zeichneQuadrat(j*s,i*s,A); 
                zeichneKreise(j*s,i*s,A,B);
            }
        }
        fill(122, 235, 66);
        line(100,100,700,100);
        fill(122, 235, 66);
        line(100,300,700,300);
    }

    public void zeichneQuadrat(int x, int y, int farbe){
        fill(farbe);
        square(x,y,s);

    }

    public void zeichneKreise( int x, int y,int farbe, int B){

        farbe=255-farbe;
        fill(farbe);
        for(int k=0;k<8;k++){
            if(B==0){

                circle(x+10,y+10,10);
                circle(x+10,y+90,10);

            }
            else{

                circle(x+90,y+10,10);
                circle(x+90,y+90,10);   

            }

        }
    }

    @Override
    public void draw()
    {

    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1b.class.getName() });
    }

}
