PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
    size(500,500);  
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olive.png");
    mushroom = loadImage("mushroom.png");
}

void draw() {
  noStroke();
    fill(#D3A755);
    ellipse(250,250, 250,250);
    fill(#C63808);
    ellipse(250,250, 225,225);
    fill(#E8BC5B);
    ellipse(250,250, 210,210);
    if(mousePressed) {
    image(pepperoni,250,250);
    pepperoni.resize(30,30);
    image(olive,200,200);
    olive.resize(30,30);
    image(mushroom,210,300);
    mushroom.resize(30,30);
    }
}
