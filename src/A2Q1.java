
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city
        City kw = new City();

        // create a robot
        Robot jerrycan = new Robot(kw, 1, 1, Direction.EAST);

        // create a path
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        // turn on the thing labels
        kw.showThingCounts(true);

        // step onto path
        jerrycan.move();


        // while statement
        while (jerrycan.canPickThing()) {
            // if there are things and his backpack has less than 7 things
            //      pick them all up

            if (jerrycan.countThingsInBackpack() < 7) {
                jerrycan.pickThing();

            }
            jerrycan.move();


        }
    }
}
//}