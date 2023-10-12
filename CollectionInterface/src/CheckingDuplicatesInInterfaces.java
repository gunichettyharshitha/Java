import java.util.LinkedList;
import java.util.Queue;

public class CheckingDuplicatesInInterfaces {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue, including duplicates
        queue.offer(1);
        queue.offer(2);
        queue.offer(2);
        queue.offer(3);

        // Removing elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Element removed: " + queue.poll());
        }
    }
}
