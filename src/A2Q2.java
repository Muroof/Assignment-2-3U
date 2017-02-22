
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city
        City kw = new City();

        // create a robot
        Robot jerrycan = new Robot(kw, 4, 0, Direction.EAST);


        // create hurdles
        new Wall(kw, 4, 0, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 6, Direction.SOUTH);
        new Wall(kw, 4, 7, Direction.SOUTH);
        new Wall(kw, 4, 8, Direction.SOUTH);

        new Wall(kw, 4, 0, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 3, Direction.EAST);
        new Wall(kw, 4, 6, Direction.EAST);

        // create thing
        new Thing(kw, 4, 8);

        // movement

        while (!jerrycan.frontIsClear()) {

            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.turnLeft();


            while (jerrycan.frontIsClear()) {
                jerrycan.move();

                if (jerrycan.canPickThing()) {

                    break;

                }

            }



        }

    }
}
