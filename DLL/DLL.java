/**
 * DLL
 */
public class DLL {

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        int arr [] = {1,2,3,4,5};
        Node head = list.ConverttoLinkedlist(arr);
        list.Display(head);
        System.out.println("");
        head = list.ReverseLinkedlist(head);
        list.Display(head);
    }

}


class Node {
    int data;
    Node next;
    Node back;

    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
    Node(int data , Node back){
        this.data = data;
        this.next = null;
        this.back = back;
    }
}

class Linkedlist{
    public Node ConverttoLinkedlist(int arr[]){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            Node newnode = new Node(arr[i] , temp);
            temp.next = newnode;
            temp = temp.next;
        }
        return head;
    }
    public void Display(Node head){
        while(head != null){
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.print("null");
    }
    public Node ReverseLinkedlist(Node head){
        while(head.next != null){
            head = head.next;
        }
        Node temp = head;
       while(temp != null){
        Swap(temp);
        temp = temp.next;
       }
        


        return head;
    }
    public void Swap(Node target){
        Node temp = target.back;
        target.back = target.next;
        target.next = temp;
    }
}
