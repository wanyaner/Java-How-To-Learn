### Recursion

Method for binomial coefficients:  
choose `n` from `m` (unordered)

	public int choose (int m, int n) {
		if (n == 0)
			return 1;
		else if (m == 0)
			return 0;
		else {
			int inc = choose(m-1,n-1);
			int exc = choose(m-1,n);
			return inc + exc ;
		}
	}
	
Powers of integers: `m^n`

	static int power(int m, int n) {
		if (n == 0)
			return 1;
		else
			return m * power(m,n-1);
	}
	
	// faster in O(log n) times
	static int fastPower(int m, int n) {
		if(n == 0)
			return 1;
		if(n % 2 == 0)
			return (fastPower(m * m, n/2));
		else
			return m * fastPower(m, n-1);
		}
		
### Lists
	List<Integer> list = new List<Integer>(2, new List<Integer> (3, new List<Integer>()));

	- list.getHead() - E
	- list.getTail() - list<E>
	- list.isEmpty() - boolean

append // join 2 lists L & M

	static List<Integer> append(List<> L, List<> M) {
		if(L.isEmpty())
			return M;
		else
			return new List(L.getHead(), append(L.getTail(), M));
	}
	
	// add to end
	static List<Integer> addtoend(List<Integer> L, int i) {
		return append(L, new List(i, empty()));
	}
	
	// reversal - O(n^2)
	static List<Integer> reverse(List<Integer> L) {
		if (L.isEmpty())
			return new List();
		else
			return addtoend(reverse(L.getTail()), L.getHead());
	}
	
find `maxinum` element

	static int max(List<Integer> L) {
		if(L.isEmpty())
			throw new IllegalArgumentException("Not Found.");
		else if(L.getTail().isEmpty())
			return L.getHead();
		else {
			int m = max(L.getTail());
			return (L.getHead() > m)? L.getHead() : m ;
		}
		
		//or
		else {
			return Math.max(L.getHead(), max(L.getTail()));
		}
	}
	
find `positive` elements

	public static List<Integer> positives(List<Integer> a) {
    	if (a.isEmpty())
      		return new List();
    	else if (a.getHead() > 0)
      		return new List(a.getHead(), positives(a.getTail()));
    	else
      		return positives(a.getTail());
  	}

`insert` in a sorted list

	static List<Integer> insert(int x, List<Integer> list) {
		if(list.isEmpty())
			return list; 
			// or return new List(x, new List());
		else if(list.getHead() >= x)
			return new List(x, list);
		else
			return new List(list.getHead(), insert(x, list.getTail()));
	}

`delete` in a sorted list

	static List<Integer> delete(int x, List<Integer> list) {
		if(list.isEmpty())
			return new List();
		else if (x < list.getHead())
			return list;
		else if (x == list.getHead())
			return delete(x, list.getTail());
		else
			return new List(list.getHead(), delete(x, list.getTail()));
	}

`search` an element - return position

	public static int find(int x, List<Integer> a) {
    	if (a.isEmpty())
      		throw new IllegalStateException("element not in list");
    	else if (x == a.getHead())
      		return 0;
    	else
      		return 1 + find(x, a.getTail());
  	}
 
`merge` two sorted lists

	 public static List<Integer> merge(List<Integer> a, List<Integer> b) {
    	if (a.isEmpty())
      		return b;
    	else if (b.isEmpty())
      		return a;
   	 	else if (a.getHead() <= b.getHead())
      		return new List(a.getHead(), merge(a.getTail(), b));
    	else
      		return new List(b.getHead(), merge(a, b.getTail()));
 	 } 	
 	 
`remove duplicates`in a sorted list

	static List<Integer> removeDuplicates(List<Integer> a) {
    	if (a.isEmpty())
      		return new List();
    	else
      		return new List(a.getHead(),
                      removeDuplicates(removeCopies(a.getHead(), a.getTail())));
  	}

 // Helper function  
 // removes all copies of x occurring at the front of a sorted list  
 // a and returns the resulting list  

  	public static List<Integer> removeCopies(int x, List<Integer> a) {
    	if (a.isEmpty())
      		return new List();
    	else if (x == a.getHead())
      		return removeCopies(x, a.getTail());
    	else
      		return a;
  	}

  // Here is another solution without a helper function

 	 static List<Integer> removeDuplicatesAlt(List<Integer> a) {
      	if (a.isEmpty())
          	return new List();
      	else if (a.getHead() == a.getTail().getHead())
          // We can ignore the head now, because there is another copy of it
          	return removeDuplicatesAlt(a.getTail());
      	else
          	return new List(a.getHead(), removeDuplicatesAlt(a.getTail()));
	  }
	}
	

## Binary Tree

Tree<Integer> t = new Tree<> (10-value, new Tree(5)-left, new Tree(20)-right);

`Postorder` traversal: left - right - value
normal order: value - left - right

    public static<E> List<E> postorderSlow(Tree<E> t) {
        if (t.isEmpty())
            return new List();
        else 
            return append(postorder(t.getLeft()),
                          append(postorder(t.getRight()), 
                                 new List(t.getValue(), 
                                          new List())));
    }

    // append creates a new list by appending two given lists
    // It is generic in the element type E.

    static<E> List<E> append(List<E> a, List<E> b) {
        if (a.isEmpty())
            return b;
        else
            return new List(a.getHead(), append(a.getTail(), b));
    }

    public static<E> List<E> postorder(Tree<E> t) {
        return postorder(t, new List());
    }

    // Helper function for postorder(Tree).
    // add the postorder traversal list of t 
    // at the front of ls

    private static<E> List<E> postorder(Tree<E> t, List<E> ls) {
        if (t.isEmpty()) 
            return ls;
        else 
            return postorder(t.getLeft(),
                             postorder(t.getRight(),
                                       new List(t.getValue(), ls)
                                       )
                             );
    }

### Search Tree

`Binary Search Trees`: left < value; right > value;

    public static boolean isSearchTree(Tree<Integer> a) {
        if (a.isEmpty()) 
            return true;
        else 
            return isSearchTree(a, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Helper function for isSearchTree.
    // Returns a boolean to say whether `a' is a search tree whose
    // values are within the range between `lowerBound' and `upperBound'.

    private static boolean isSearchTree(Tree<Integer> a, 
                                        int lowerBound, int upperBound)
    {
        if (a.isEmpty()) 
            return true;
        else {
            int newLower = Math.max(a.getValue(), lowerBound);
            int newUpper = Math.min(a.getValue(), upperBound);

            return 
								a.getValue() < upperBound &&
                a.getValue() > lowerBound &&
                isSearchTree(a.getLeft() , lowerBound, newUpper) &&
                isSearchTree(a.getRight(), newLower  , upperBound) ;
        }
    }
   
Test if is a member in BST
	
	static boolean member(int x, Tree<Integer> t) {
		if(t.isEmpty())
			return false;
		else if(x < t.getValue())
			return member(x, t.getLeft());
		else if(x > t.getValue())
			return member(x, t.getRight());
		else // ==
			return true;
	}
	
insert

	static Tree<Integer> insert (int x, Tree<Integer> t) {
		if(t.isEmpty())
			return new Tree(x,new Tree(), new Tree());
		else if(x < t.getValue())
			return new Tree(t.getValeu, insert(x, t.getLeft()), t.getRight());
		else if(x > t.getValue())
			return new Tree(t.getValeu, t.getLeft(), insert(x, t.getRight()));
		else
			return t;
	}
			    
Traversing binary search trees

    public static void printDescending(Tree<Integer> a) {
        if (a.isEmpty())
            return;
        else {
            printDescending(a.getRight());
            System.out.println(a.getValue());
            printDescending(a.getLeft());
        }
    }

Maximum value in a search tree

    public static int max(Tree<Integer> a) {
        if (a.isEmpty()) 
            throw new IllegalStateException(
                        "empty tree given, no max value exists");
        else {
            if (right.isEmpty()) 
                return a.getValue();
            else 
                return max(a.getRight());
        }
    }

delete 

    public static Tree<Integer> delete(Tree<Integer> a, int x) {
        if (a.isEmpty()) 
            return a;
        else {
            int value  = a.getValue();
            Tree<Integer> left  = a.getLeft();
            Tree<Integer> right = a.getRight();

            if (x > value) {
                Tree<Integer> newRight = delete(right, x);
                return new Tree(a.getValue(), left, newRight);
            } 
            else if (x < value) {
                Tree<Integer> newLeft = delete(left, x);
                return new Tree(a.getValue(), newLeft, right);
            } 
            else {
                // The deletion!
                if (left.isEmpty()) 
                    return right;
                else if (right.isEmpty()) 
                    return left;
                /*
                 * Neither subtree is empty.
                 * So one subtree is going to lose a node.
                 * Let it be the left.
                 * We delete the maximum from the left subtree.
                 */
                 
                else {
                    int predecessor = max(left);
                    return new Tree(predecessor,
                                    delete(left, predecessor),
                                    right
                                    );
                }
            }
        }
    }
   
### Height-Balance / AVL Tree

AVL: for every node, the left and right subtrees have a difference in height of at most 1. 

    public static<E> boolean isHeightBalanced(Tree<E> t) {
		if (t.isEmpty())
			return true;
		else {
			int lh = t.getLeft().getHeight();
			int rh = t.getRight().getHeight();
			if ((Math.abs(lh-rh)) <= 1) {
				return (isHeightBalanced(t.getLeft()) &&
						isHeightBalanced(t.getRight()));
			}else
				return false;
		}
    }

Insertion / Deletion in HBT

    public static Tree<Integer> insertHB(int x, Tree<Integer> t) {
				if (t.isEmpty())
						return new Tree(x);
				else if (x < t.getValue()) {
						Tree<Integer> newLeft = insertHB(x, t.getLeft());
						return rebalanceForLeft(
											new Tree(t.getValue(), newLeft, t.getRight()));
				}
				else if (x > t.getValue()) {
						Tree<Integer> newRight = insertHB(x, t.getRight());
						return rebalanceForRight(
										  new Tree(t.getValue(), t.getLeft(),newRight));
				}
        else
            return t;
    }

    
    public static<E> Tree<Integer> deleteHB(Tree<Integer> a, int x) {
        if (a.isEmpty()) 
            throw new IllegalArgumentException(
                          "deleteHB: value is not in the tree");
        else {
            int value  = a.getValue();
            Tree<Integer> left  = a.getLeft();
            Tree<Integer> right = a.getRight();

            if (x > value) {
                Tree<Integer> newRight = deleteHB(right, x);
                return rebalanceForLeft(
                           new Tree(a.getValue(), left, newRight));
            } else if (x < value) {
                Tree<Integer> newLeft = deleteHB(left, x);
                return rebalanceForRight(
                         new Tree(a.getValue(), newLeft, right));

            } else {
                if (left.isEmpty()) {
                    return right;
                } else if (right.isEmpty()) {
                    return left;
                } else {
                    int predecessor = max(left);
                    return rebalanceForRight(
                               new Tree(predecessor,
                                         deleteHB(left, predecessor),
                                         right));
                }
            }
        }
    }
    
    // rebalanceForLeft is called when the left subtree of t may have
    // grown taller by one notch.
    // If it is indeed taller than the right subtree by two notches,
    // return a height-balanced version of t using single or double rotations.
    // The subtrees of t are assumed to be already height-balanced and
    // no effort is made to rebalance them.

    private static<E> Tree<E> rebalanceForLeft(Tree<E> t) {
        if (height(t.getLeft()) <= height(t.getRight()) + 1)
            return t;
        else {
            Tree<E> l = t.getLeft();  // height h+2
            Tree<E> r = t.getRight();  // height h
            Tree<E> ll = l.getLeft();  // height h+1?
            Tree<E> lr = l.getRight(); // height h+1?
            if (height(ll) > height(r)) {
                // LL rotation - single
                return new Tree(l.getValue(),
                                ll,
                                new Tree(t.getValue(), lr, r));
            }
            else {
                assert height(lr) > height(r);
                // LR rotation - double
                return new Tree(lr.getValue(),
                                new Tree(l.getValue(),
                                         l.getLeft(),
                                         lr.getLeft()),
                                new Tree(t.getValue(),
                                         lr.getRight(),
                                         t.getRight())
                               );
            }
        }
    }

    private static<E> Tree<E> rebalanceForRight(Tree<E> t) {
        if (height(t.getRight()) <= height(t.getLeft()) + 1)
            return t;
        else {
            Tree<E> l = t.getLeft();  // height h
            Tree<E> r = t.getRight();  // height h+2
            Tree<E> rl = r.getLeft();  // height h+1?
            Tree<E> rr = r.getRight(); // height h+1?
            if (height(rr) > height(l)) {
                // RR rotation - single
                return new Tree(r.getValue(),
                                new Tree(t.getValue(), l, rl),
                                rr);
            }
            else {
                assert height(rl) > height(l);
                // RL rotation - double
                return new Tree(rl.getValue(),
                                new Tree(t.getValue(),
                                         t.getLeft(),
                                         rl.getLeft()),
                                new Tree(r.getValue(),
                                         rl.getRight(),
                                         r.getRight())
                                );
            }
        }
    }

