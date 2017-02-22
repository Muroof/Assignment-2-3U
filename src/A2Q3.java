
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city
        City kw = new City();

        // create a robot
        Robot jerrycan = new Robot(kw, 16, 14, Direction.WEST);

        // when robot isn't on avenue 0
        while (jerrycan.getAvenue() > 0) {

            // depending on direction of the robot move appropriately 
            if (jerrycan.getDirection() == Direction.EAST) {

                jerrycan.turnLeft();
                jerrycan.turnLeft();
            }
            if (jerrycan.getDirection() == Direction.NORTH) {

                jerrycan.turnLeft();

            }

            if (jerrycan.getDirection() == Direction.WEST) {
            }

            if (jerrycan.getDirection() == Direction.SOUTH) {

                jerrycan.turnLeft();
                jerrycan.turnLeft();
                jerrycan.turnLeft();
            }
            jerrycan.move();

            if (jerrycan.getAvenue() == 0) {
                jerrycan.turnLeft();
                jerrycan.turnLeft();
                jerrycan.turnLeft();
            }

        }

        while (jerrycan.getStreet() > 0) {

            jerrycan.move();
        }
    }
}
