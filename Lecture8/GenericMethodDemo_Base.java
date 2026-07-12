
public class GenericMethodDemo_Base {
	  public static void main(String[] args ) {
	    Integer[] integers = {1, 2, 3, 4, 5};
	    String[] strings = {"London", "Paris", "New York", "Austin"};

	    GenericMethodDemo_Base.<Integer>print(integers);
	    GenericMethodDemo_Base.<String>print(strings);
	  }

	  public static <E> void print(E[] list) {
	    for (int i = 0; i < list.length; i++)
	      System.out.print(list[i] + " ");
	    System.out.println();
	  }
	    
	}

