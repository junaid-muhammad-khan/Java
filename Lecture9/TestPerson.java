//  Programming with Java
//  by John R. Hubbard
//  Copyright 2004 by McGraw-Hill
//  ch08\ex03\TestPerson.java

//package ch08.ex03;

//import ch08.ex01.Name;

class TestPerson {
  public static void main(String[] args) {
    Person ww = new Person(new Name("William", "Windsor"), 'M');
    Person cw = new Person(new Name("Charles", "Windsor"), 'M');
    Person ds = new Person(new Name("Diana", "Spencer"), 'F');
    Person es = new Person(new Name("Edward", "Spencer"), 'M');
    Person ew = new Person(new Name("Elizabeth", "Windsor"), 'F');
    Person pm = new Person(new Name("Philip", "Mountbatten"), 'M');
    Person eb = new Person(new Name("Elizabeth", "Bowes-Lyon"), 'F');
    Person gw = new Person(new Name("George", "Windsor"), 'M');
    ww.setFather(cw);
    ww.setMother(ds);
    ds.setFather(es);
    cw.setMother(ew);
    cw.setFather(pm);
    ew.setMother(eb);
    ew.setFather(gw);
    System.out.println(ww);
  }
}

/*  Output:
William Windsor (M)
  mother: Diana Spencer (F)
    father: Edward Spencer (M)
  father: Charles Windsor (M)
    mother: Elizabeth Windsor (F)
      mother: Elizabeth Bowes-Lyon (F)
      father: George Windsor (M)
    father: Philip Mountbatten (M)
*/
