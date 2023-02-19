public class DoublyLinkedList {
    private DoubleNode head; 
    private int size;

    public DoublyLinkedList() {
        head = null; 
        size = 0;
    }
    public void addFront(String data) { 
        if(head == null)
            head = new DoubleNode(null, data, null);
        else {
            DoubleNode newDoubleNode = new DoubleNode(null, data, head);
            head.previous = newDoubleNode;
            head = newDoubleNode; 
        }
        
    }
    public void print() { 
        DoubleNode current = head; 
        while(current != null){
            System.out.println(current.data());
            current = current.next;
        }
        size++;
    }
    
    public void addRear(String data) { 
        if(head == null)
            head = new DoubleNode(null, data, null);
        else {
            DoubleNode current = head; 
            while(current.next != null) {
                current = current.next;
            }
            DoubleNode newDoubleNode = new DoubleNode(current, data, null);
            current.next = newDoubleNode;
        }
    }
    public void removeFront() {
        if(head == null) return;

        head = head.next;
        head.previous = null;
        size--;
    }
    public void removeBack() {
        if(head == null) return;

        if(head.next == null) {
            head = null; 
            size--;
            return;
        }
        DoubleNode current = head;
        while(current.next.next !=null){
            current = current.next;
        }
        current.next = null; 
        size--;
    }
    public void removeNodeAt(int index){
        if(head == null) return;
        if(index < 1 || index > size) return;

        DoubleNode current = head;
        int i = 1;
        while(i < index){
            current = current.next;
            i++;

        }
        if(current.next == null){
            current.previous.next = null;
        }
        else if(current.previous == null) {
            current = current.next;
            current.previous = null;
            head = current;
        }
        else{
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;

    }
    public int indexOf(String str){
        return indexOf(str);
    
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null; 
    }
    
    public static void main(String[]args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFront("Output number 1");
        dll.addFront("Output number2");
        dll.addRear("Output number 3");
        dll.addRear("Output number 4");
        dll.removeFront();
        dll.print();
        dll.removeNodeAt(2);
    }
}