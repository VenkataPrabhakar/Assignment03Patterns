package TreeAssign;
import java.util.Collections;
import java.util.List;
public class AssignmentThree {
	public static void main(String[] args) {
		// Problem 1
		
		BST b1 = new BST(20);
		b1.add(10);
		b1.add(5);
		b1.add(15);
		b1.add(30);
		b1.add(25);
		b1.add(40);
		
		
		BST b2 = new BST();
		b2.setRoot(20);
		b2.add(10);
		b2.add(5);
		b2.add(15);
		b2.add(30);
		b2.add(25);
		b2.add(40);
		
		
		
		problem1(b1, b2);
		
		// end of problem 1
		
		
		// problem 2
		BST b3 = new BST(20);
		b3.add(10);
		b3.add(5);
		b3.add(15);
		b3.add(30);
		b3.add(25);
		System.out.println("Problem 2 output: "+  problem2(b3, 35));
		
		
		
		// problem3
		BST p3 = new BST(20);
		p3.add(10);
		p3.add(5);
		p3.add(15);
		p3.add(30);
		p3.add(25);
		System.out.println("Problem 3 output: "+  problem3(p3, 6));
		
		//problem4
		BST b4 = new BST(20);
		b4.add(10);
		b4.add(5);
		b4.add(15);
		b4.add(30);
		b4.add(25);
		b4.add(40);
		System.out.print("Problem 4 output: ");
		problem4(b4.root, 0);
	}
	
	
	public static void problem1(BST b1, BST b2) {
		List<Integer> l1 = b1.asList();
		List<Integer> l2 = b2.asList();
		
		var isListIdentical  = l1.equals(l2);
		if(isListIdentical)
			System.out.println("Problem 1 output: "+isListIdentical + ", Both trees are identical");
		
		else System.out.println("Problem 1 output: " +isListIdentical + ", Both trees are not identical");
		
	}
	
	public static int problem2(BST T1, int k) {
		List<Integer> l1 = T1.asList();
		
		var s = l1.stream().filter(v -> k >= v);
		
		if(s.count() == 0) 
			return -1;
		
		
		s = l1.stream().filter(v -> k >= v);
		int sum = s.reduce(0, (acc, curr) -> acc + curr);
		return sum;
	}
	
	public static int problem3(BST T1, int k) {
		List<Integer> l1 = T1.asList();
		Collections.sort(l1, Collections.reverseOrder());
		return l1.get(k-1);
	}
	
	
	public static void problem4(Node n, int level) {
		if(n == null) {
			return;
		}
		
		problem4(n.left, level + 1);
		if(level % 2 == 0) {
			System.out.print(n.val + " ");			
		}
		
		problem4(n.right, level + 1);
	}

}
