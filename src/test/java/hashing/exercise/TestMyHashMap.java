package hashing.exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import hashing.exercise.MyHashMap;

public class TestMyHashMap
{

   @Test
   public void testHash()
   {
      MyHashMap myHashMap = new MyHashMap();
     
      String testString = "hello";

      assertEquals(Integer.valueOf(730),Integer.valueOf(myHashMap.hash(testString)));

   }

   @Test
   public void testInsert()
   {
      MyHashMap myHashMap = new MyHashMap();

      myHashMap.put("first", "One");
      myHashMap.put("second", "Two");
      myHashMap.put("third", "Three");
      myHashMap.put("fourth", "Four");
      myHashMap.put("fifth", "Five");
      myHashMap.put("sixth", "Six"); 

      assertEquals("Six",myHashMap.get("sixth"));
      assertEquals("Four",myHashMap.get("fourth"));
      assertEquals("Five",myHashMap.get("fifth"));
      assertEquals("Three",myHashMap.get("third"));
      assertEquals("Two",myHashMap.get("second"));
      assertEquals("One",myHashMap.get("first"));
      assertEquals(null,myHashMap.get("gixth"));

   }


   @Test
   public void testDelete()
   {
      MyHashMap myHashMap = new MyHashMap();

      myHashMap.put("first", "One");
      myHashMap.put("second", "Two");
      myHashMap.put("third", "Three");
      myHashMap.put("fourth", "Four");
      myHashMap.put("fifth", "Five");
      myHashMap.put("sixth", "Six");

      assertEquals("Six",myHashMap.get("sixth"));
      assertEquals("Four",myHashMap.get("fourth"));
      assertEquals("Five",myHashMap.get("fifth"));
      assertEquals("Three",myHashMap.get("third"));
      assertEquals("Two",myHashMap.get("second"));
      assertEquals("One",myHashMap.get("first"));
      assertEquals(null,myHashMap.get("gixth"));

      myHashMap.delete("sixth");
      assertEquals(null,myHashMap.get("sixth"));

   }

}
