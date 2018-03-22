package finalTask;

public class Mail<T> {

    String from;
    String to;
    T content;

    public Mail(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getContent() {
        return content;
    }

}
