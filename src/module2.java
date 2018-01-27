

public class module2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0,-5, Direction.LEFT);
        moveRobot(robot, 10, -6);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }


    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int n = 0;
        int gapX=toX;
        int gapY=toY;
        int rX=robot.x;
        int rY=robot.y;

        if(toX < 0){
            while(robot.getDirection()!= Direction.LEFT){
                robot.turnLeft();
            }
            System.out.println("Повернул налево "+robot.getDirection());
            ////////////////////
            if(gapX<robot.getX()){
                while (robot.getX() != gapX) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }

                if(gapY<robot.getY()){
                    if (toY > 0) {
                        while (robot.getDirection() != Direction.DOWN) {
                            robot.turnRight();
                        }
                        System.out.println("Повернул Вверх " + robot.getDirection());
                        while (robot.getY() != gapY) {
                            robot.stepForward();
                            System.out.println("шаг" + ++n);
                        }
                    }

                    if (toY < 0) {
                        while (robot.getDirection() != Direction.DOWN) {
                            robot.turnLeft();
                        }
                        System.out.println("Повернул Вниз " + robot.getDirection());
                        while (robot.getY() != gapY) {
                            robot.stepForward();
                            System.out.println("шаг" + ++n);
                        }
                    }

                }

            } else if(gapX>robot.getX()){
                while(robot.getDirection()!= Direction.RIGHT){
                    robot.turnLeft();
                }
                while (robot.getX() != gapX) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }
            }

            if(gapY>robot.getY()) {

                if (toY > 0) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                    System.out.println("Повернул Вверх " + robot.getDirection());
                    while (robot.getY() != gapY) {
                        robot.stepForward();
                        System.out.println("шаг" + ++n);
                    }
                }

                if (toY < 0) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnLeft();
                    }
                    System.out.println("Повернул Вниз " + robot.getDirection());
                    while (robot.getY() != gapY) {
                        robot.stepForward();
                        System.out.println("шаг" + ++n);
                    }
                }
            }
            else {

                while (robot.getX() != gapX) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }
                n = 0;
                if (toY > 0) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                    System.out.println("Повернул Вверх " + robot.getDirection());
                    while (robot.getY() != gapY) {
                        robot.stepForward();
                        System.out.println("шаг" + ++n);
                    }
                }

                if (toY < 0) {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnLeft();
                    }
                    System.out.println("Повернул Вниз " + robot.getDirection());
                    while (robot.getY() != gapY) {
                        robot.stepForward();
                        System.out.println("шаг" + ++n);
                    }
                }
            }
        } else if(toX > 0) {
            while(robot.getDirection()!= Direction.RIGHT){
                robot.turnRight();
            }
            if(gapX<robot.getX()){
                while(robot.getDirection()!= Direction.LEFT){
                    robot.turnRight();
                }
                while (robot.getX() != gapX) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }

                if(gapY<robot.getY()){
                    if (toY > 0) {
                        while (robot.getDirection() != Direction.DOWN) {
                            robot.turnRight();
                        }
                        System.out.println("Повернул Вверх " + robot.getDirection());
                        while (robot.getY() != gapY) {
                            robot.stepForward();
                            System.out.println("шаг" + ++n);
                        }
                    }

                    if (toY < 0) {
                        while (robot.getDirection() != Direction.DOWN) {
                            robot.turnLeft();
                        }
                        System.out.println("Повернул Вниз " + robot.getDirection());
                        while (robot.getY() != gapY) {
                            robot.stepForward();
                            System.out.println("шаг" + ++n);
                        }
                    }

                }

            }
            System.out.println("Повернул направо "+robot.getDirection());
            while (robot.getX() != gapX) {
                robot.stepForward();
                System.out.println("шаг"+ ++n);
            }
            n=0;
            if(robot.getY()>toY ){
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                System.out.println("Повернул Вверх " + robot.getDirection());
                while (robot.getY() != gapY) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }
            } else {
                if (toY < 0) {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnRight();
                    }
                    System.out.println("Повернул Вниз " + robot.getDirection());
                    while (robot.getY() != gapY) {
                        robot.stepForward();
                        System.out.println("шаг" + ++n);
                    }
                }
                if (toY > 0) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnLeft();
                    }
                    System.out.println("Повернул Вверх " + robot.getDirection());
                    while (robot.getY() != gapY) {
                        robot.stepForward();
                        System.out.println("шаг" + ++n);
                    }
                }
            }
        } else if (toX==0){
            n=0;

            if(robot.getX()>0){
                while(robot.getDirection()!= Direction.LEFT){
                    robot.turnRight();
                }
                while (robot.getX() != gapX) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }

            } else if (robot.getX()<0){
                while(robot.getDirection()!= Direction.RIGHT){
                    robot.turnRight();
                }
                while (robot.getX() != gapX) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }

            }
            if(robot.getY()>0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                while (robot.getY() != gapX) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }
            } else if(robot.getY()<0){

                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                while (robot.getY() != gapX) {
                    robot.stepForward();
                    System.out.println("шаг" + ++n);
                }

                } else {

                if (toY < 0) {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnRight();
                    }
                    System.out.println("Повернул Вниз " + robot.getDirection());
                    while (robot.getY() != gapY) {
                        robot.stepForward();
                        System.out.println("шаг" + ++n);
                    }
                }
                if (toY > 0) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnLeft();
                    }
                    System.out.println("Повернул Вверх " + robot.getDirection());
                    while (robot.getY() != gapY) {
                        robot.stepForward();
                        System.out.println("шаг" + ++n);
                    }
                }
            }
        }
        System.out.println(robot.x+" "+robot.y);
        System.out.println(rX+" "+rY+" начальные");
    }

}


