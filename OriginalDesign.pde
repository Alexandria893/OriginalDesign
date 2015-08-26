
void setup()
{
size(500,500);
//fill(0); //text color
textSize(32);
noLoop();
}

void draw()
{
	background(150);
	DrawEllipse();
	keyPressed();


}

void keyPressed()
{
fill(0,0,0);
text(key,250,250);
redraw();
}

void DrawEllipse(){
fill(random(0,255),random(0,255),random(0,255),100);
stroke(random(0,255),random(0,255),random(0,255));
ellipse(250,250,random(0,500),random(0,500));
}

