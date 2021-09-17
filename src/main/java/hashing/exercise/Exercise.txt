Interview coding question:


Implement a hash-map data structure from scratch , where both key and value are of string data type.
The details of how a hash works can be found in Chapter 11 of the book "Introduction to
Algorithms" by Cormen, Leiserson, Rivest. You should also refer to Section 3.7 of "The
Algorithm Design Manual" by Steven Skiena. For the required hash-map implementation,
the following conditions hold true:
1. The key is made up of lower-case english alphabets only (a,b,c...z). It can be of any
length.
2. Values are of string data type.
3. The hash function to be used is the one given in Section 3.7 of Skiena.
4. Choose a suitable size of the hash-map, that is, the number of buckets. It should be
greater than 100.
4. Collisions will be resolved using Chaining. Doubly linked lists will be used to store
colliding entries.
You will have to implement the following operations on the hash-map:
a. Create an empty hash-map.
b. Insert a (key, value) pair into the hash-map.
c. Delete a (key) from the hash-map (if present).
d. Search for a (key) in the hash-map, and if present return its value. Else return null.
