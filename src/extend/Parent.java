package extend;

public abstract class Parent<T> {
    String row;
    String column;
    T content;

    public Parent(String row, String column, T content) {
        this.row = row;
        this.column = column;
        this.content = content;
    }
}
