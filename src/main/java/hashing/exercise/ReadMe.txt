Readme
======

This program, MyHashMap.java, is a customized implementation of HashMap to store key value pairs.
Separate Chaining Algorithm is used to implement this hashMap. For Chaining Storage, we use DoublyLinkedList. DoublyLinkedList is also implemented as part of this exercise.

Hashing:
The hashing function/formula used is from sec 3.7 from the Book 'The Algorithm Design Manual' by Steven S.Skiena. Each of the lower case alphabet set {a,b,c,...,z} is assigned the int values {0,1,2,...,25} 

Hashtable:
Hashtable size is set as 997 by default - prime number.
We also have a MyHashMap constructor that accepts HashTable size as an argument so that we can set a customized Hashtable size


Assumptions:
   All key, value will be just String,String.
   All the key will from the lower case alphabet set {a,b,...,z}

In this customized HashMap, following functions are implemented
a.insert
b.get
c.delete

JUnit testing is done using the following CLI

mvn clean test -Dtest=hashing.exercise.TestMyHashMap
mvn clean test -Dtest=hashing.exercise.TestDoublyLinkedList



You can find complete problem statement in Exercise.txt
