/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

      public static void main(String[] args) {
         Display.openWorld("maps/mountain.map");
         Display.setSize(16, 16);
         Display.setSpeed(5);
         Climber karel = new Climber();
         Climber bob = new Climber();
         karel.putBeeper();
         karel.turnRight();
         karel.move();
         karel.climbUpRight();
         bob.turnRight();
         bob.move();
         bob.climbUpRight();
         karel.climbUpRight();
         bob.climbUpRight();
         karel.climbUpRight();
         bob.climbUpRight();
         karel.move();
         karel.climbDownRight();
         bob.move();
         bob.climbDownRight();
         karel.move();
         karel.climbDownRight();
         bob.move();
         bob.climbDownRight();
         karel.pickBeeper();
         karel.turnAround();
         karel.climbUpLeft();
         bob.turnAround();
         bob.climbUpLeft();
         karel.climbUpLeft();
         karel.putBeeper();
         bob.climbUpLeft();
         karel.move();
         karel.climbDownLeft();
         bob.move();
         bob.climbDownLeft();
         karel.climbDownLeft();
         bob.climbDownLeft();
         karel.climbDownLeft();
         bob.climbDownLeft();
         
         
   }      
}
