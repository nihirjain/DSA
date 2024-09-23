/**
 * LInkedlist
 */
public class LInkedlist {

    public static void main(String[] args) {
        List list = new List();
        int arr1[] = {1,2,3};
        int arr2[] = {2,1,3};
        Node head1 = list.ConverttoLinkedlist(arr1);
        Node head2 = list.ConverttoLinkedlist(arr2);
        int carry = 0;
        Node head = null;
        Node temp = head;
        while(head1 != null && head2 != null){
            int sum = head1.data + head2.data + carry;
            if(sum >= 10){
                
                sum = sum%10;
                Node newnode = new Node(sum);
                if(head == null){
                    head = newnode;
                    temp = temp.next;
                    break;
                }
                temp.next = newnode;
                temp = temp.next;
                carry = 1;
            }
            else{
                Node newnode = new Node(sum);
                if(head == null){
                    head = newnode;
                    temp = temp.next;
                    break;
                }
                head.next = newnode;
                temp = temp.next;
                carry = 0;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        list.Display(head);
    }

}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class List{

    public Node ConverttoLinkedlist(int arr[]){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            Node newnode = new Node(arr[0]);
            head.next = newnode;
            temp = temp.next;
        }
        return head;
    }
    public void Display(Node head){
        while (head != null) {
            System.out.print(head.data + "-->");
            head = head.next;
        }
        System.out.print("null");
    }
}

