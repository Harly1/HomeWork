package autoClose;

public class MyClose implements  AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new RuntimeException();
    }
}
