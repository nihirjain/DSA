/**
 * hello
 */
public class hello {

    public static class Linkedlist{
        Node head;
        Linkedlist(){
            this.head = null;
        }

        void AtStart(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
            }
            else{
                newnode.next = head;
                head = newnode;
            }
        }
        void Insert(int data , int index){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
            }
            
        }
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
}