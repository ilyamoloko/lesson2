package lesson;

import java.awt.*;

public class Main {

    public static void moveRobot(Robot robot, int toX, int toY) {

        int tX = robot.getX();
        int tY = robot.getY();


        if (tX >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (tX != toX) {
                robot.stepForward();
                tX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (tX != toX) {
                robot.stepForward();
                tX++;
            }
        }

        if (tY >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (tY != toY) {
                robot.stepForward();
                tY--;
            }

        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (tY != toY) {
                robot.stepForward();
                tY++;
            }

        }

    }
}
