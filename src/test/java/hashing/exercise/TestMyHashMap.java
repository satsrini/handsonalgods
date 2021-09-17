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


}
