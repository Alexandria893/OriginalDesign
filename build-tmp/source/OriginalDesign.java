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

int diameter = 10;
public void setup()
{
size(500,500);
//fill(0); //text color
textSize(32);
}

public void draw()
{
	background(150);
	DrawEllipse();
	DrawEllipse2();
	keyPressed();


}

public void keyPressed()
{
fill(0,0,0);
//text(key,250,250);
text(key,250,250);
redraw();
}

public void DrawEllipse2()
{
fill(random(0,255),random(0,255),random(0,255));
stroke(random(0,255),random(0,255),random(0,255));
ellipse(250,250,diameter,diameter);
frameRate(10);
if (diameter<250)
{
diameter=diameter+5;
if (diameter==250)
	{
		diameter=10;
	}
}
	
}

public void DrawEllipse()
{
int d=450;
fill(random(0,255),random(0,255),random(0,255));
stroke(random(0,255),random(0,255),random(0,255));
ellipse(250,250,d,d);
frameRate(10);
while (d>=150)
{
d=d-5;
}
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
