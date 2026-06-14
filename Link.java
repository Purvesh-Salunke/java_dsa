import java.util.LinkedList;
public class Link{
    public  void main(String[] args){
        LinkedList<String> linkedlist = new LinkedList<String>();
        //implementing stack using LinkedList
        /*linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("C");
        linkedlist.push("D");
        linkedlist.pop();
        System.out.println(linkedlist);
        */
       //implementing queue using LinkedList
       
       linkedlist.offer("A");
       linkedlist.offer("B");
       linkedlist.offer("C");
       linkedlist.offer("D");
       //linkedlist.poll();
       linkedlist.add(2,"E");
       linkedlist.remove(2);
       System.out.println(linkedlist);
       
       System.out.println(linkedlist.peekFirst());
       System.out.println(linkedlist.peekLast());
       linkedlist.addFirst("0");
       linkedlist.addLast("1");
       System.out.println(linkedlist);
       String first = linkedlist.removeFirst();
       String last = linkedlist.removeLast();
       System.out.printf("%s %s\n",first,last);
       System.out.println(linkedlist);

       
    }
}