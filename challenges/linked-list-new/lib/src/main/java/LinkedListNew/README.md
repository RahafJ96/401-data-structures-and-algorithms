# Singly Linked List
<!-- Short summary or background information -->
* Today's code challenge involved creating linked lists with nodes. A linked list is a collection of ordered values that are stored in node objects. Nodes are an object used to hold a single value and a pointerto the next node.Collaborated with Edward Hou, Cristian Robles, and James Mansour on this code challenge.


## Challenge
<!-- Description of the challenge -->
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
- Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
- Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
- Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
- Define a method called toString (or str in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Used Classes to implement the linked list with the O(1) and O(n) for its methods .
- Created a node head, and then pointed it to the next node, and then used a loop to connect the other nodes until it reached a null node. I then added the test for the head node and the other nodes.
 ## API
<!-- Description of each method publicly available to your Linked List -->
- **insert:**  takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance
- **includes:** takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list
- **toString:** takes in no arguments and returns a string representing all the values in the Linked List, formatted as: `"{ x } -> { y } -> { z } -> NULL"`
