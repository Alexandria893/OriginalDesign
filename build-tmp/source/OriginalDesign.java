import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {


public void setup()
{
size(500,500);
//fill(0); //text color
textSize(32);
noLoop();
}

public void draw()
{
	background(150);
	DrawEllipse();
	keyPressed();


}

public void keyPressed()
{
fill(0,0,0);
text(key,250,250);
redraw();
}

public void DrawEllipse(){
fill(random(0,255),random(0,255),random(0,255),100);
stroke(random(0,255),random(0,255),random(0,255));
ellipse(250,250,random(0,500),random(0,500));
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
