package hashing.exercise;

public class MyHashMap
{

    private int N; // current, total key value pairs
    private int M; // size of Hashtable

    private DoublyLinkedList<String,String>[] lists;


    public MyHashMap()
    {
       this(997);
    }

    public MyHashMap(int M)
    {
       this.M = M;
       lists = (DoublyLinkedList<String,String>[])new Object[M];

       for(int i = 0; i < M; i++)
       {
          lists[i] = new DoublyLinkedList<>();
       }

    }

    public void put(String key, String value)
    {
       lists[hash(key)].put(key,value);
    }

    public String get(String key)
    {
       return lists[hash(key)].get(key);
    }

    public void delete(String key)
    {
       lists[hash(key)].delete(key);
    }

    private int hash(String key)
    {
       return key.hashCode()%M;
    }

    private static int intValue(char x)
    {
       return (int)x - (int)'a';
    }

}
