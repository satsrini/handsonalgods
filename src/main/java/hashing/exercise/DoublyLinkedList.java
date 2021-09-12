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
           tail = head;  // both head and tail are same for a single entry
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

    public void delete(Key key)
    {
        Node current = head;

        while(current != null)
        {
            if(key.compareTo(current.key) == 0)
            {
                if(size() == 1) // only one element in the list, getting deleted.
                {
                   head = null;
                   tail = null;
                   current = null;
                   N = 0;
                   return;
                }

                Node previous = current.previous;
                Node next = current.next;

                if(previous == null) // head is getting deleted  
                {
                   head = next;
                   head.previous = null;
                }else
                if(next == null)  // tail is getting deleted
                {
                   tail = previous;
                   tail.next = null;
                }
                else
                {              
                   // normal
                   previous.next = next;
                   next.previous = previous;
                }
                current = null;
                N--;
            }else
            {
                current = current.next;
            }

        }

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
