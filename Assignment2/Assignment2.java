
import java.util.*;
import java.io.*;

public class Assignment2 {
	
	public class NameAndFrequency implements Comparable<NameAndFrequency> {
		String name;
		Integer frequency;
		
		@Override
		public int compareTo(NameAndFrequency o) {
			if (this.frequency < o.frequency)
				return 1;
			if (this.frequency > o.frequency)
				return -1;
			return 0;
		}
		
		@Override
		public String toString() {
			return name + " (" + frequency + ")\n";
		}
	}
	
	private BST<NameAndFrequency> tree;

	public Assignment2() {
		tree = new BST<NameAndFrequency>();
		
		loadNamesData("src\\assignment2_Summer2026\\yob2013f.txt");

		System.out.println("\n\nList of all names in decreasing order\n\n");
		tree.inorder();

		System.out.println("\n\nName that has been given the most\n\n");
		tree.findMaximumByRecursion();
		tree.findMaximumByIteration();
		
		System.out.println("\n\nNames given to more than 10000 babies\n\n");
		tree.findGreaterThan(10000);

		System.out.println("\n\nThe most popular 5 baby names\n\n");
		tree.findMostPopular(5);
		
		System.out.println("\n\nMirroring the tree\n\n");
		tree.mirror();

		System.out.println("\n\nList of all names in increasing order, since the elements are mirrored\n\n");
		tree.inorder();
		
		System.out.println("\nDone");
	}

	private void loadNamesData(String fileName) {
		try {
			File file = new File(fileName);
			Scanner input = new Scanner(file);

			while (input.hasNext()) {
				String line = input.next();

				NameAndFrequency n = new NameAndFrequency();
				n.name = line.split(",")[0];
				n.frequency = Integer.parseInt(line.split(",")[1]);

				tree.insert(n);
			}
			input.close();
			System.out.format("Loaded %d elements from %s\n\n", tree.getSize(), fileName);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/** Main method */
	public static void main(String[] args) {
		new Assignment2();
	}
}
