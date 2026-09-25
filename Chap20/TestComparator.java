import java.util.Comparator;

public class TestComparator {
  public static void main(String[] args) {
    Rectangle g1 = new Rectangle();
    Circle g2 = new Circle();

    GeometricObject g = 
      max(g1, g2, new GeometricObjectComparator());
    
    System.out.println("The area of the larger object is " + 
      g.getArea());
  }
  
  private static GeometricObject max(Rectangle g1, Circle g2, GeometricObjectComparator c) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'max'");
  }

  public static GeometricObject max(GeometricObject g1, 
      GeometricObject g2, Comparator<GeometricObject> c) {
    if (c.compare(g1, g2) > 0)
      return g1;
    else
      return g2;
  }
}