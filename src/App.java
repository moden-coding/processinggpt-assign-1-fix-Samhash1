import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings() {
        size(800, 600); // Set window size to 800x600
    }
     public void setup(){
        strokeWeight( 3);
        stroke(0, 0, 200);
        fill(255, 0, 0);
        triangle(600, 100, 700, 200, 500, 200);
        
       
        strokeWeight( 5);
        stroke(0, 200, 0 );
        fill(0, 180, 0);
        rect(50, 50, 200, 100);
       
        strokeWeight( 50);
        stroke(0, 100, 200);
        line(50, 50, 600, 100);
     }

}
