int diameter = 10;
void setup()
{
size(500,500);
//fill(0); //text color
textSize(32);
frameRate(10);
}

void draw()
{
	background(150);
	DrawEllipse();
	DrawEllipse2();


}

void keyPressed()
{
fill(0,0,0);
//text(key,250,250);
text(key,250,250);
redraw();
}

void DrawEllipse2()
{
fill(random(0,255),random(0,255),random(0,255));
stroke(random(0,255),random(0,255),random(0,255));
ellipse(250,250,diameter,diameter);
if (diameter<250)
{
diameter=diameter+5;
if (diameter==250)
	{
		diameter=10;
	}
}
	
}

void DrawEllipse()
{
int d=450;
fill(random(0,255),random(0,255),random(0,255));
stroke(random(0,255),random(0,255),random(0,255));
ellipse(250,250,d,d);
while (d>=150)
{
d=d-5;
}
}