public class DoubleNode {
    public String data;
    public DoubleNode previous; 
    public DoubleNode next; 

 
    public DoubleNode(String data)  {
        previous = null;
        this.data = data;
        next = null;
        
    }

    public DoubleNode(DoubleNode previous, String data, DoubleNode next){
        previous=this.previous; 
        data=this.data;
        next=this.next; 
    }

    public String data() {
        return data; 
    }
}