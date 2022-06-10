package pl.camp.it.test;

public class QueueElement {
    private int priority;
    private String value;

    public QueueElement(int priority, String value) {
        this.priority = priority;
        this.value = value;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
