//package chapter20;

import java.util.*;

public class TestArrayAndLinkedList_Base {
  public static void main(String[] args) {
	// List
    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(1); // 1 is autoboxed to new Integer(1)
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(1);
    arrayList.add(4);
    System.out.println("A list of integers in the array list:");
    System.out.println(arrayList);

    arrayList.add(0, 10);
    arrayList.add(3, 30);
    
    System.out.println("After inserting new elements, "
    		+ "an updated list of integers in the array list:");
    System.out.println(arrayList);

    // LinkedList
    System.out.println("\n--Linked List demo-------");
    LinkedList<Object> linkedList = new LinkedList<>(arrayList);
    System.out.println(linkedList);
    linkedList.add(1, "red");
    System.out.println(linkedList);
    linkedList.removeLast();
    linkedList.addFirst("green");
    System.out.println(linkedList);
    
    System.out.println("\nDisplay the linked list backward:");
    for (int i = linkedList.size() - 1; i >= 0; i--) {
      System.out.print(linkedList.get(i) + " ");
    }
        
     //arrayList.removeLast(); //error The method removeLast() is undefined for the type List<Integer>

    
    
  }
}
