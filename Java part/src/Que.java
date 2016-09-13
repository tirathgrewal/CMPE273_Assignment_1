import java.util.*;
public class Que{
  private int size=0;
    private int front=0;// adding people 
    private int rear=0; //removing people
    String q[]=new String[10]; 
    public String enqueue(String name) {
        q[rear]=name;
        rear=(rear+1);
        size++;
        return name;
    }

    public String dequeue() {
        if (size==0) {
            System.out.println("Queue is empty");
            return "ok";
        }
        else{
        String rem=q[front];
        q[front]=null;
        front=(front+1);
        size--;
        return rem;
      }
    }
    public String peek() {
        if (size==0) {
            System.out.println("Queue is empty");
        }
        return q[front];
    }

    public int size() {
        return size;
    }
public static void main(String args[])
{
    Que obj=new Que();
    String n1=obj.enqueue("Ted");
    String n2=obj.enqueue("Viv");
    String n3=obj.enqueue("Tom");
    String n4=obj.enqueue("Sid");
    String n5=obj.enqueue("Jim");
    System.out.println("Initial Size of Queue at the Movie Ticket Window: "+obj.size());
    while(obj.size()>0)
    {
    String a=obj.dequeue();
    System.out.println(a+" is now leaving the queue.");
    System.out.println("Counter is now serving: "+a);
    if(obj.size()!=0){
    System.out.println("Next Person in the queue :"+obj.peek());
    System.out.println("Total number of people waiting in the line: "+obj.size());
  }
  }
        
}
}
