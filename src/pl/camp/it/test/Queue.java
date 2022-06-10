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
        QueueElement q = QueueElements.get(0);
        QueueElement q1 = QueueElements.get(1);
        QueueElement q2 = QueueElements.get(2);
        if (q.getPriority() > q1.getPriority() && q.getPriority() > q2.getPriority()) {
            return q.getValue();
        }
        if (q1.getPriority() > q.getPriority() && q1.getPriority() > q2.getPriority()) {
            return q1.getValue();
        }
        if (q2.getPriority() > q1.getPriority() && q2.getPriority() > q.getPriority()) {
            return q2.getValue();
        }
        return "";
    }

    public String getHighestPriority() {
        int priorit = 0;

        for (QueueElement queueElement : this.QueueElements) {
            if (priorit < queueElement.getPriority()) {
                priorit = queueElement.getPriority();
            }
        }
        for (QueueElement queueElement1 : this.QueueElements) {
            if (priorit == queueElement1.getPriority()) {
                return queueElement1.getValue();
            }

        }
        return "";
    }

    public static Queue getInstance() {
        return instance;
    }

}
