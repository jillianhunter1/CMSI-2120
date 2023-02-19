public class CircularLinkedListNode{
    private Node head;
    private Node linkedList;
    private int count;
    CircularLinkedListNode(){
        count = 0;
    }
    public void addNode(String str){ 
        Node newNode = new Node(str);
        if(count == 0){
            linkedList = newNode;
            linkedList.next = linkedList;
            linkedList.prev = linkedList;
            head = linkedList;

        } else{
            newNode.prev = linkedList.prev;
            newNode.next = linkedList;
            linkedList.prev.next = newNode;
            linkedList.prev = newNode;

            head = linkedList;
             
        }
        count++;
    }
    
    public void insertAfter(int index, String str){
        if(index > count) {
            System.out.println("Does not exist");
            return;
        }
        Node newNode = new Node(str);
        Node current = head;
        int i = 0;
        while(i < index){
            i++;
            current = current.next;
        }
        if(current.next == null){
            newNode.prev = current.next;
            count++;
            return;
        }else{
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode; 
            current.prev = newNode;
            count++;
        }
    }

    public void insertBefore(int index, String str){ 
        if(index > count) {
            System.out.println("Does not exist");
            return;
        }
        Node newNode = new Node(str);
        Node current = head;
        int i = 0;
        while(i < index){
            i++;
            current = current.next;
        }
        if(current.prev == null){
            newNode.next = current.prev;
            count++;
            return;
        }
        if(current.next == null){
            newNode.prev = current.next;
            count++;
            return;
        }else{
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode; 
            current.prev = newNode;
            count++;
        }
        
    }
    
    public void delete(int index){ 
        if(index > count) {
            System.out.println("No values here");
            return;
        }
        Node current = head;
        int i = 0;
        while(i < index){
            i++;
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        count--;
    }
    public int indexOf(String str) { 
        int i = 0;
        Node current = head;
        while(i < count){
            if(str.equalsIgnoreCase(current.str)){
                break;
               
                
            }
            else if(i > count){
                System.out.println("This is not in this list");
            }else{
                i++;
            }
        }
        System.out.println(i);
        
        return -1;
    }
    public void print(){ 
        if(count == 0){
            System.out.println("Uh Oh! Your list is empty");
            return;

        }
        Node current = head;
        do{
            System.out.println(current.str);
            current = current.next;
        }while(current != head);
    }
    
    private class Node{
        Node next;
        Node prev;
        String str;
        
        Node(String str) {
            this.str = str;
        }
    }
}