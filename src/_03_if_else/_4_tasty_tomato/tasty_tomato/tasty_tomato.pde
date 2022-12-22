void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#2F7C1A);
    rect(245, 103, 12, 32);
    fill(#CB3E3E);
    ellipse(219, 200, 150, 150);
    ellipse(281, 200, 150, 150);
    fill(#C8C8C8);
    if(mousePressed) {
    ellipse(146, 200, 30, 30);
    }
}
