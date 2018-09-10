
int xDropPosition;
int yDropPosition = 0;

int score = 0;
int heightBucket = 100;
boolean start = true;

void setup() {
  size(600, 600);
  xDropPosition = (int) random(width);
}

void draw() {
  background(179, 178, 255);

  // On s'occupe du seau
  fill(255, 140, 31); // rempli la forme
  rect(mouseX, height - heightBucket, 80, heightBucket);

  // On positionne la goutte
  if (yDropPosition < height)
    yDropPosition += 5;
  else 
  {
    upDrop();
  }

  // On dessine la goutte
  fill(255, 255, 255); // rempli la forme
  stroke(0, 0, 0);  //  colorie le contour
  ellipse(xDropPosition, yDropPosition, 25, 40);

  // test si elle est dans le seau
  if (yDropPosition >= (height - heightBucket)) {
    testInBucket();

    //if (!testInBucket()) {
    //  if (score < 1)
    //  println("PERDU !!!!");
    //}
    upDrop();
  }
  delay(20);
        displayScore();

}

boolean testInBucket() {
  start = false;
  if ((xDropPosition >= mouseX) && (xDropPosition <= (mouseX + 81))) {   
    score++;
    return true;
  } else {
    score--;
    return false;
  }
}

void upDrop() {
  yDropPosition = 0;
  xDropPosition = (int) random(width);
}

void displayScore() {
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  if (score <= 0 && !start){
    text("Perdu !!!", 20, 40);
    delay(500);
    exit();
  }
}
