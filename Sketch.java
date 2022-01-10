import processing.core.PApplet;

public class Sketch extends PApplet {
	
	public void settings() {
    size(500, 500);
  }

  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
    
    // Stroke Settings
    strokeWeight((float)0.006*height);
    stroke(0, 0, 0);

    // Quadrant 1
    for (int i = height/20; i <= height/2; i += height/20) {
      line(i, 0, i, height/2);
      line(0, i, width/2, i);
    }

    // Quadrant 2
    fill(0, 255, 255);
    for (int circleY = ((height)/14); circleY <= ((height/14)*7); circleY += ((height)/11)) {
      for (int circleX = ((width)/14)+250; circleX <= ((width/14)*7)+250; circleX += ((width)/11)) {
        ellipse(circleX, circleY, 25, 25);
      }
    }

    // Quadrant 3
    strokeWeight((float)0.002*height);
    for (int i = 0; i <= height/2; i++) {
      stroke(i, i, i);
      line(i, height/2, i, height);
    }

    // Quadrant 4
    for (int angle = 0; angle < 360; angle += 45) {
      fill(167, 10, 247);
      stroke(0, 0, 0);
      strokeWeight((float)0.004*height);

      pushMatrix();
      translate((width/2)+width/4, (height/2)+height/4);
      rotate(radians(angle));
      ellipse(0,0,height/20,height/3);
      popMatrix();
    }
    
  fill(7, 146, 20);
  noStroke();
  ellipse((width/2)+width/4, (height/2)+height/4, 50, 50);
  }
}