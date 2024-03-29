public class LinkedList {

    Node head;
     static class Node {
         int data;
         Node next;

         Node(int d){
             data = d;
             next = null;
         }
     }
     public static LinkedList insert(LinkedList list, int data){
         Node new_node = new Node(data);
         if(list.head == null)
             list.head = new_node;
         else {
             Node last = list.head;
             while(last.next != null)
             {
                 last = last.next;
             }
             last.next = new_node;
         }
         return list;
     }

     public static LinkedList reverse(LinkedList list) {
         Node curr = list.head;
         Node prev = null;
         Node next = null;
         while(curr != null) {
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
         list.head = prev;
         return list;
     }

     public static void printList(LinkedList list) {
         Node currNode = list.head;

         System.out.print("LinkedList: ");
         while (currNode != null) {
             System.out.print(currNode.data + " ");

             // Go to next node
             currNode = currNode.next;
         }
     }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list = insert(list,1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        printList(list);
        list = reverse(list);

        System.out.println("\nLinkedList After reversing");

        printList(list);

    }
}
