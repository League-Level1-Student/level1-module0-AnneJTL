
PImage pictureOfRecord;     //as member variable
int xPosition = 0;
int yPosition = 0;
int angle = 0;
//int width = 600;
//int height = 600;

void setup(){
  size(600,600);     //in setup method  
  pictureOfRecord = loadImage("record.png");     //in setup method  
  pictureOfRecord.resize(600, 600);
  image(pictureOfRecord, xPosition, yPosition);     //in draw method

}

void draw(){
    // a deplacer dans mousePressed() pour le 6
    angle += 180;
    rotateImage(pictureOfRecord, angle);
    image(pictureOfRecord, xPosition, xPosition);
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}

/* pour le 6 
void mousePressed(){
    angle += 10;
    rotateImage(pictureOfRecord, angle);
    image(pictureOfRecord, xPosition, xPosition);

}
*/
