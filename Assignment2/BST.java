package assignment2_Summer2026;

public class BST<E extends Comparable<E>> {
  protected TreeNode<E> root;
  protected int size = 0;

  public BST() {
  }

  public BST(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      insert(objects[i]);
  }

  public boolean search(E e) {
    TreeNode<E> current = root;
    while (current != null) {
      if (e.compareTo(current.element) < 0) {
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        current = current.right;
      }
      else
        return true;
    }
    return false;
  }

  public boolean insert(E e) {
    if (root == null)
      root = createNewNode(e);
    else {
      TreeNode<E> parent = null;
      TreeNode<E> current = root;
      while (current != null)
        if (e.compareTo(current.element) < 0) {
          parent = current;
          current = current.left;
        }
        else if (e.compareTo(current.element) > 0) {
          parent = current;
          current = current.right;
        }
        else
          return false;

      if (e.compareTo(parent.element) < 0)
        parent.left = createNewNode(e);
      else
        parent.right = createNewNode(e);
    }

    size++;
    return true;
  }

  protected TreeNode<E> createNewNode(E e) {
    return new TreeNode<>(e);
  }

  /** Inorder traversal from the root */
  public void inorder() {
    inorder(root);
  }

  /** Inorder traversal from a subtree */
  protected void inorder(TreeNode<E> root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.element + " ");
    inorder(root.right);
  }

  public void postorder() {
    postorder(root);
  }

  protected void postorder(TreeNode<E> root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.element + " ");
  }

  public void preorder() {
    preorder(root);
  }

  protected void preorder(TreeNode<E> root) {
    if (root == null) return;
    System.out.print(root.element + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static class TreeNode<E extends Comparable<E>> {
    public E element;
    public TreeNode<E> left;
    public TreeNode<E> right;

    public TreeNode(E e) {
      element = e;
    }
  }

  public int getSize() {
    return size;
  }

  public TreeNode<E> getRoot() {
    return root;
  }

  public java.util.ArrayList<TreeNode<E>> path(E e) {
    java.util.ArrayList<TreeNode<E>> list =
      new java.util.ArrayList<>();
    TreeNode<E> current = root;

    while (current != null) {
      list.add(current);
      if (e.compareTo(current.element) < 0) {
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        current = current.right;
      }
      else
        break;
    }

    return list;
  }

  public boolean delete(E e) {
    TreeNode<E> parent = null;
    TreeNode<E> current = root;
    while (current != null) {
      if (e.compareTo(current.element) < 0) {
        parent = current;
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        parent = current;
        current = current.right;
      }
      else
        break;
    }

    if (current == null)
      return false;

    if (current.left == null) {
      if (parent == null) {
        root = current.right;
      }
      else {
        if (e.compareTo(parent.element) < 0)
          parent.left = current.right;
        else
          parent.right = current.right;
      }
    }
    else {
      TreeNode<E> parentOfRightMost = current;
      TreeNode<E> rightMost = current.left;

      while (rightMost.right != null) {
        parentOfRightMost = rightMost;
        rightMost = rightMost.right;
      }

      current.element = rightMost.element;

      if (parentOfRightMost.right == rightMost)
        parentOfRightMost.right = rightMost.left;
      else
        parentOfRightMost.left = rightMost.left;
    }

    size--;
    return true;
  }

  public java.util.Iterator<E> iterator() {
    return new InorderIterator();
  }

  private class InorderIterator implements java.util.Iterator<E> {
    private java.util.ArrayList<E> list =
      new java.util.ArrayList<>();
    private int current = 0;

    public InorderIterator() {
      inorder();
    }

    private void inorder() {
      inorder(root);
    }

    private void inorder(TreeNode<E> root) {
      if (root == null)return;
      inorder(root.left);
      list.add(root.element);
      inorder(root.right);
    }

    public boolean hasNext() {
      if (current < list.size())
        return true;

      return false;
    }

    public E next() {
      return list.get(current++);
    }

    public void remove() {
      delete(list.get(current));
      list.clear();
      inorder();
    }
  }

  public void clear() {
    root = null;
    size = 0;
  }  

	public void mirror() {
	    mirror(root);
	}

	private void mirror(TreeNode<E> localRoot) {
		if (localRoot == null) return;

		// Swap the left and right children
		TreeNode<E> temp = localRoot.left;
		localRoot.left = localRoot.right;
		localRoot.right = temp;

		// Recurse into the (now swapped) subtrees
		mirror(localRoot.left);
		mirror(localRoot.right);
	}

	public void findMaximumByRecursion() {
		findMaximumByRecursion(root);
	}

	private void findMaximumByRecursion(TreeNode<E> node) {
		if (node == null) return;
		if (node.left == null) {
			// No node to the left has a higher frequency, so this is the max
			System.out.print(node.element);
		}
		else {
			findMaximumByRecursion(node.left);
		}
	}
	
	public void findMaximumByIteration() {
		if (root == null) return;
		TreeNode<E> current = root;
		while (current.left != null) {
			current = current.left;
		}
		System.out.print(current.element);
	}
	
	public void findGreaterThan(int n) {
		findGreaterThan(root, n);
	}

	private void findGreaterThan(TreeNode<E> node, int n) {
		if (node == null) return;

		findGreaterThan(node.left, n);

		int frequency = extractFrequency(node.element);
		if (frequency > n) {
			System.out.print(node.element);
		}

		findGreaterThan(node.right, n);
	}

	/** Pulls the numeric frequency out of an element's toString(),
	 *  which is formatted as "Name (frequency)". */
	private int extractFrequency(E element) {
		String s = element.toString();
		int open = s.indexOf('(');
		int close = s.indexOf(')');
		return Integer.parseInt(s.substring(open + 1, close).trim());
	}
	
	public void findMostPopular(int n) {
		findMostPopular(root, n, 0);
	}

	/** Inorder-style traversal (left = higher frequency first) that
	 *  stops once 'n' elements have been printed. Returns the running
	 *  count so far instead of using an array/list to track it. */
	private int findMostPopular(TreeNode<E> node, int n, int printedSoFar) {
		if (node == null || printedSoFar >= n) return printedSoFar;

		printedSoFar = findMostPopular(node.left, n, printedSoFar);

		if (printedSoFar < n) {
			System.out.print(node.element);
			printedSoFar++;
		}
		else {
			return printedSoFar;
		}

		printedSoFar = findMostPopular(node.right, n, printedSoFar);

		return printedSoFar;
	}
}