
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city
        City kw = new City();

        // create a robot
        RobotSE jerrycan = new RobotSE(kw, 2, 2, Direction.NORTH);

        //create a castle

        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 2, 3, Direction.WEST);

        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.WEST);
        new Wall(kw, 1, 2, Direction.SOUTH);

        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.WEST);
        new Wall(kw, 1, 5, Direction.SOUTH);

        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.SOUTH);

        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.WEST);
        new Wall(kw, 4, 5, Direction.SOUTH);


        while(true) {
            
            if (!jerrycan.frontIsClear()){
                
                jerrycan.turnLeft();
                jerrycan.move();
                jerrycan.turnRight();
                jerrycan.move();
                jerrycan.move();
                jerrycan.turnRight();
                jerrycan.move();
                jerrycan.move();
                jerrycan.turnRight();
                jerrycan.move();
                jerrycan.turnLeft();
                jerrycan.move();
            }
        }
        


    }
}