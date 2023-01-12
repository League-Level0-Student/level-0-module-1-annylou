int one = 0; 
int x = 150;
int y = 110;

size (400,300); 
textSize(20); 

fill(#C61686);
rect(0,0,400,400);

fill(#FFFFFF);
for (one=1; one<=3; one+=1) {
 text("ice cream", x,y); 
 y+=20;
}
text("banana", 150, 170);
