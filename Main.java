//Stack
/* 
import java.util.Stack;
public class Main{
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("jalebi");
        stack.push("minecraft");
        stack.push("samosa");
        stack.push("velorant");
        System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("velorant"));


    }
}
*/
//Queue
/*
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();
        queue.offer("jalebi");//add
        queue.offer("wall");
        queue.offer("bible");
        queue.offer("samosa");
        queue.poll();//remove
        queue.poll();
        
        System.out.println(queue);
        System.out.println(queue.peek());//element
        //imp methods 
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("bible"));

    }
}
*/
//PriorityQueue
/*
import java.util.Queue;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("A");
        queue.offer("F");
        queue.offer("E");
        queue.offer("C");
        queue.offer("D");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
*/
