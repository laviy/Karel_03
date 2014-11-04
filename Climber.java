import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Climber extends Athlete { 
   public Climber() {
      super(8, 1, Display.NORTH, 1);
      }
   public Climber (int x) {
      super(x, 1, Display.NORTH, 1);
      }
   public void climbUpRight() {
      turnLeft();
      move();
      move();
      turnRight();
      move();
      }
   public void climbDownRight() {
      turnRight();
      move();
      move();
      turnLeft();
      }
   public void climbUpLeft() {
      turnRight();
      move();
      move();
      turnLeft();
      move();
      }
   public void climbDownLeft() {
      turnLeft();
      move();
      move();
      turnRight();
      move();
      }
      
   }