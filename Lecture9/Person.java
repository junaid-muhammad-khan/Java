//  Programming with Java
//  by John R. Hubbard
//  Copyright 2004 by McGraw-Hill
//  ch08\ex03\Person.java

//package ch08.ex03;
//import ch08.ex01.Name;

public class Person {
  protected Name name;
  protected char sex;   // 'M' or 'F'
  protected String id;  // e.g., Social Security number
  protected Person mother;
  protected Person father;
  private static final String twoBlanks = "  ";
  private static String tab = "";

  public Person(Name name, char sex) {
    this.name = name;
    this.sex = sex;
  }

  public Person(Name name, char sex, String id) {
    this.name = name;
    this.sex = sex;
    this.id = id;
  }

  public Name name() {
    return name;
  }
  
  // The sex() and id() accessor methods are the same as in EXAMPLE 8.2

  public void setId(String id) {
    this.id = id;
  }

  public void setMother(Person mother) {
    this.mother = mother;
  }

  public void setFather(Person father) {
    this.father = father;
  }

  public String toString() {
    String s = new String(name + " (" + sex + ")");
    if (id != null) s += "; id: " + id;
    s += "\n";
    if (mother != null) {
      tab += twoBlanks;                // adds two blanks
      s += tab + "mother: " + mother;
      tab = tab.substring(2);          // removes two blanks
    }
    if (father != null) {
      tab += twoBlanks;                // adds two blanks
      s += tab + "father: " + father;
      tab = tab.substring(2);          // removes two blanks
    }
    return s;
  }
}
