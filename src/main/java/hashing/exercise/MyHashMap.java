package hashing.exercise;

public class MyHashMap
{

    private static int ALPHA=26;

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
       lists = (DoublyLinkedList<String,String>[])new DoublyLinkedList[M];

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

    public int hash(String key)
    {
       long hash = 0;
       int L = key.length();

       for(int i = 0; i < L; i++ )
       {
          hash += Math.pow(ALPHA, L-(i+1))*intValue(key.charAt(i));
       }
 
       return (int)(hash%M);

    }

    private static int intValue(char x)
    {
       return (int)x - (int)'a';
    }

}
