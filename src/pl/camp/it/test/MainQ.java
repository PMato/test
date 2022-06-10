package pl.camp.it.test;

public class MainQ {
    public static void main(String[] args) {
        Queue queue = Queue.getInstance();
        queue.add("agsh",1);
        queue.add("agjsh",2);
        queue.add("aggsh",3);
        queue.add("aegsh",5);
        queue.add("ag2sh",6);
        queue.addWithHighestPriority("xxx");
        queue.add("agqsh",7);

        System.out.println("dddddd");
        System.out.println(queue.get());
        System.out.println(queue.getHighestPriority());
    }
}
