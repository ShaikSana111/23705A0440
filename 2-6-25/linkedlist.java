public class Main{
    public static void main(String[] args){
        Node head = new node(10);
        Node node_1 = new node(20);
        Node node_2 = new node(30);
        Node node_3 = new node(40);
        head.next = node_1;
        node_1.next =node_2;
        node_2.next =node_3;
        
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;        }
    }
} 