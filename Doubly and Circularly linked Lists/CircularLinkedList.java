public class CircularLinkedList{
    public static void main(String[] args){
        CircularLinkedListNode list = new CircularLinkedListNode();
        list.addNode("January");
        list.addNode("Febuary");
        list.addNode("March");
        list.addNode("April");
        list.addNode("May");
        list.addNode("June");
        list.addNode("July");
        list.addNode("August");
        list.addNode("September");

        list.insertAfter(2,"october");
        list.insertBefore(1, "November");
        list.delete(3);
        list.print();
        list.indexOf("December");
        
    }
}