package tryCatch427;

public class Run {
    public static void main(String[] args) {

        moveRobot(new RobotConnectionManagerImple(), 5, 7);

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        // your implementation here
        int i = 1;
        boolean flag = false;
        Throwable throwable = new Throwable();


        while ((i < 4) && (flag == false)) {

            RobotConnection robotConnection = null;

            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                flag = true;

            } catch (RobotConnectionException e) {


            } catch (Exception e) {
                throwable = e;
                throw e;

            } finally {
                if (throwable == null) {
                    robotConnection.close();

                } else {

                    try {
                        robotConnection.close();
                    } catch (Throwable unused) {

                    }
                }


            }

            if ((i == 3) && (flag == false)) {
                throw new RobotConnectionException("3 попытка не удалась");
            }

            i++;
            // your implementation here

        }
    }

}
