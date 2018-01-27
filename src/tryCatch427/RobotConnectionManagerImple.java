package tryCatch427;

public class RobotConnectionManagerImple implements RobotConnectionManager {
    @Override
    public RobotConnection getConnection() {
        return new RobotConnectionImple();
    }
}
