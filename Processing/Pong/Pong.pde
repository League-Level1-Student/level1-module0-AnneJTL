import ddf.minim.*;  
Minim minim;
AudioSample sound;

int xPosition = 0;
int yPosition = 50;
int xSpeed = 10;
int ySpeed = 10;
boolean xRight = true;
boolean yDown = true;
PImage backgroundImage;

void setup() {
  size(600, 600);
  
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  backgroundImage = loadImage("arbre.png");
}

void draw() {
  background(209, 253, 255);
  //image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);


  // X
  changeXSpeed();
  moveFromLeftToRight();  

  // Y
  changeYSpeed();
  moveFromUpToDown();

  // Draw
  
  fill(255, 0, 0); // rempli la forme
  stroke(125, 125, 125);
  ellipse(xPosition, yPosition, 20, 20);
  
  fill(0, 0, 255); // rempli la forme
  stroke(255, 255, 255);
  rect(mouseX, height-30, 100, 30);
}


public void moveFromLeftToRight() {
  if (xRight) {
    xPosition += xSpeed;
  } else {
    xPosition -= xSpeed;
  }

  if (xPosition >= width) {
    xRight = false;
  }
  if (xPosition <= 0)
  {
    xRight = true;
  }
}

public void changeXSpeed() {
  xSpeed = (int) random(15);
}
public void moveFromUpToDown() {
  if (yDown) {
    yPosition += ySpeed;
  } else {
    yPosition -= ySpeed;
  }

  if (yPosition >= height){
    if ( intersects(xPosition, yPosition, mouseX, height - 300, 100)){
    yDown = false;
    sound.trigger();
    }
    else {
      println("GAME OVER !!!");
      exit();
    }
  }
  
  
  if (yPosition <= 0)
  {
    yDown = true;
  }
}

public void changeYSpeed() {
  ySpeed = (int) random(7);
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
