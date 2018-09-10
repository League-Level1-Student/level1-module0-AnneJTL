int xPosition = 0;
int yPosition = 0;


void setup() {
  // 2. Set your canvas size and background color in the setup method
  size(500, 700);
  background(188, 90, 9);
}



void draw() {
  // 3. In your draw method, use a for loop to draw 300 ellipses in a diagonal line across the canvas.
  // drawDiagonal();

  //4. Now change the x and y location of each ellipse to "different" random numbers that are inside the canvas. 
  // Note: random() returns values that are type float so your x and y variable types should also be float.
  //drawRandom();

  //7. Now change the x and y location of each ellipse to the value returned by the getWormX() and getWormY() methods (use the for loop variable as the parameter to these methods). 
  drawMagic();
}

//11. [Optional] Add another worm every time the user clicks the mouse.
void mousePressed() {
  drawMagic();
}

public void drawMagic() {
  makeMagical();
  for (int i = 0; i < 300; i++) {
    // 5. Set the color of each ellipse.
    fill((int) random(255), (int) random(255), (int) random(255));
    ellipse(getWormX(i), getWormY(i), 15, 15);
  }
}

public void drawRandom() {
  for (int i = 0; i < 300; i++) {
    // 5. Set the color of each ellipse.
    fill((int) random(255), (int) random(255), (int) random(255));
    ellipse(random(width), random(height), 15, 15);
  }
}

public void drawDiagonal() {
  for (int i = 0; i < 300; i++) {
    fill(#52F59F);
    ellipse(xPosition, yPosition, 15, 15);
    xPosition ++;
    yPosition+= 2;
  }
}

// 6. Paste this code at the bottom of your sketch.

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
  fill( 0, 0, 0, 10 );
  rect(0, 0, width, height);
  noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
