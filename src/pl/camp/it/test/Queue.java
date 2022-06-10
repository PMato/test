package pl.camp.it.test;


import java.util.LinkedList;
import java.util.List;

public class Queue {
    private final List<QueueElement> QueueElements = new LinkedList<>();
    private static final Queue instance = new Queue();

    public void add(String value, int priority) {

        this.QueueElements.add(new QueueElement(priority, value));
    }

    public void addWithHighestPriority(String value) {
        int priority = 0;
        for (QueueElement queueElement : this.QueueElements) {
            if (priority < queueElement.getPriority()) {
                priority = queueElement.getPriority();
            }

        }
        add(value, priority + 1);
    }

    public String get() {

        if (QueueElements.get(0).getPriority() > QueueElements.get(1).getPriority() &&
                QueueElements.get(0).getPriority() > QueueElements.get(2).getPriority()) {
            return QueueElements.get(0).getValue();
        }
        if (QueueElements.get(1).getPriority() > QueueElements.get(0).getPriority() &&
                QueueElements.get(1).getPriority() > QueueElements.get(2).getPriority()) {
            return QueueElements.get(1).getValue();
        } else {
            return QueueElements.get(2).getValue();
        }
    }

    public String getHighestPriority() {
        int priority = 0;

        for (QueueElement queueElement : this.QueueElements) {
            if (priority < queueElement.getPriority()) {
                priority = queueElement.getPriority();
            }
        }
        for (QueueElement queueElement1 : this.QueueElements) {
            if (priority == queueElement1.getPriority()) {
                return queueElement1.getValue();
            }

        }
        return "Pusta Kolejka!!!";
    }

    public static Queue getInstance() {
        return instance;
    }

}
