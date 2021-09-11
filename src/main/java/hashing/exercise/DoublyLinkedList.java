package hashing.exercise;

public class DoublyLinkedList<Key extends Comparable<Key>, Value>
{

    private Node head;
    private Node tail;
    private int N;

    public DoublyLinkedList()
    {


    }

    public void put(Key key, Value value)
    {

       Node current = get(key,head);

       if(current != null) // key already exists, so updating the value
       {
           current.value = value;
           return;
       }

       Node newNode = new Node(key,value);

       if(size() == 0) // first entry
       {
           head = newNode; 
       }else
       if(size() == 1)  // second entry
       {
           newNode.next = head;
           head.previous = newNode;
           tail = head;
           head = newNode;
       }else
       {
           newNode.next = head;
           head.previous = newNode;
           head = newNode;
       }

       N++;
    }

    public Value get(Key key)
    {
        Node current = get(key,head);

        if(current == null)
        {
            return null;
        }

        return current.value;
    }

    private Node get(Key key, Node current)
    {
 
        while(current != null)
        {
            if(key.compareTo(current.key) == 0)
            {
                return current;
            }
            
            current = current.next;
        }

        return null;
    }

    public boolean isEmpty()
    {
       return N==0;
    }

    public int size()
    {
       return N;
    }

    private class Node
    {
       private Key key;
       private Value value;
       private Node previous;
       private Node next;

       private Node(Key key, Value value){
           this.key = key;
           this.value = value;
       }


    }

}
