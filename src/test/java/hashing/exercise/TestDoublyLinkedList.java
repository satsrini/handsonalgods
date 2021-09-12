package hashing.exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import hashing.exercise.DoublyLinkedList;

public class TestDoublyLinkedList
{

   @Test
   public void testInsert()
   {

       DoublyLinkedList<String,String> doublyLinkedList = getList();

       assertEquals(Integer.valueOf(5),Integer.valueOf(doublyLinkedList.size()));
 
       doublyLinkedList.put("Two", "SecondSecond");

       assertEquals(Integer.valueOf(5),Integer.valueOf(doublyLinkedList.size()));

   }

   @Test
   public void testGet()
   {

       DoublyLinkedList<String,String> doublyLinkedList = getList();

       assertEquals("First",doublyLinkedList.get("One"));
       assertEquals("Second",doublyLinkedList.get("Two"));
       assertEquals(null,doublyLinkedList.get("one"));
   }

   @Test
   public void testDelete()
   {

       DoublyLinkedList<String,String> doublyLinkedList = getList();

       assertEquals("Third",doublyLinkedList.get("Three"));
       assertEquals(Integer.valueOf(5),Integer.valueOf(doublyLinkedList.size()));

       doublyLinkedList.delete("Three");

       doublyLinkedList.print();

       assertEquals(null,doublyLinkedList.get("Three"));
       assertEquals(Integer.valueOf(4),Integer.valueOf(doublyLinkedList.size()));


   }



   @Test
   public void testPrint()
   {

       DoublyLinkedList<String,String> doublyLinkedList = getList();

       doublyLinkedList.print();

       assertEquals(true,true);
   }

   private DoublyLinkedList<String,String> getList()
   {

       DoublyLinkedList<String,String> doublyLinkedList = new DoublyLinkedList<>();

       doublyLinkedList.put("One", "First");
       doublyLinkedList.put("Two", "Second");
       doublyLinkedList.put("Three", "Third");
       doublyLinkedList.put("Four", "Fourth");
       doublyLinkedList.put("Five", "Fifth");

       return doublyLinkedList;

   }

}
