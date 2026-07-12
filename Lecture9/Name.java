//  Programming with Java
//  by John R. Hubbard
//  Copyright 2004 by McGraw-Hill
//  ch08\ex01\Name.java

//package ch08.ex01;

public class Name {
  protected String first;   // e.g., "William"
  protected String middle;  // e.g., "Jefferson"
  protected String last;    // e.g., "Clinton"

  public Name() {  // default constructor
  }

  public Name(String first, String last) {
    this.first = first;
    this.last = last;
  }

  public Name(String first, String middle, String last) {
    this(first,last);
    this.middle = middle;
  }

  public String getFirst() {
    return first;
  }
  
  public String getMiddle() {
    return middle;
  }
  
  public String getLast() {
    return last;
  } 

  public void setFirst(String first) {
    this.first = first;
  }

  public void setMiddle(String middle) {
    this.middle = middle;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public String toString() {
    String s = new String();
    if (first != null) s += first + " ";
    if (middle != null) s += middle + " ";
    if (last != null) s += last + " ";
    return s.trim();
  }
}
