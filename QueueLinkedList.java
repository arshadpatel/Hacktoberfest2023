public class QueueLinkedList.java {
    class Queue{
        Node front,rear=null;
        int size;
        Queue(){
            front=rear=null;
            size=0;
        }

        void enqueue(int x){
            Node temp= new Node(x);
            size++;
            if(front==null){
                front=rear=temp;
            }
            rear.next=temp;
            rear=temp;
        }

        void dequeue(){
            if(front == null) return;
            size--;
            front=front.next;
            if(front==null) rear=null;
        }
    }
}
