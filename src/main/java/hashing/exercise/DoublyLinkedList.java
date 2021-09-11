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
       private Node previousNode;
       private Node nextNode;

       private Node(Key key, Value value){
           this.key = key;
           this.value = value;
       }


    }

}
