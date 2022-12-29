
void setup() {
  PImage face = loadImage("face.jpeg");
size(300,400);
face.resize(300,400);
image(face, 0, 0);
}
void draw() {
  fill(255,0,0);
  ellipse(122,100, 70,70);
  ellipse(188,105, 60,60);
  fill(0,0,0);
  ellipse(122,100, 10,10);
  ellipse(188,105, 10,10);
}
