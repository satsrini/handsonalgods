package hashing.exercise;

public class MyHashMap<Key extends Comparable<Key>,Value >
{

    private int N; // current, total key value pairs
    private int M; // size of Hashtable

    private DoublyLinkedList<Key,Value>[] lists;


    public MyHashMap()
    {
       this(997);
    }

    public MyHashMap(int M)
    {
       this.M = M;
       lists = (DoublyLinkedList<Key,Value>[])new Object[M];

       for(int i = 0; i < M; i++)
       {
          lists[i] = new DoublyLinkedList<>();
       }

    }

    public void put(Key key, Value value)
    {
       lists[hash(key)].put(key,value);
    }

    public Value get(Key key)
    {
       return lists[hash(key)].get(key);
    }

    public void delete(Key key)
    {
       lists[hash(key)].delete(key);
    }

    private int hash(Key key)
    {
       return key.hashCode()%M;
    }

}
