package TreeAssign;
import java.util.ArrayList;
import java.util.List;


public class BST {

    Node root;
    BST(int val) {
          this.root  = new Node(val);
    }
    
    BST() {
    	this.root = null;
    }

	public void setRoot(int val) {
		this.root = new Node(val);
	}

	public boolean add(int val) {
        if(root == null) {
              root.val = val;
              return true;
        } else {
        	Node n = findNode(val);
        	if(n!=null) {
        	      return true;
        	} else {
        	      return false;
        	}
        }
    }
    
    private Node findNode(int inp) {
        Node current  = root;
        while(current != null) {
              if(current.val < inp ) {
                    if(current.right == null) {
                          current.right = new Node(inp);
                          return current.right;
                    }
                    current = current.right;
              } else if(current.val > inp) {
                    if(current.left == null) {
                          current.left = new Node(inp);
                          return current.left;
                    }
                    current = current.left;
              }
              else {
                    return null;
              } 
      }
        return current;
    }
    
	    public void print() {
	        Node current = root;
	        List<Integer> list = new ArrayList<Integer>();
	        traverse(current, list);
	        System.out.println(list);
	    }
	    
	    public List<Integer> asList() {
	    	 Node current = root;
	         List<Integer> list = new ArrayList<Integer>();
	         traverse(current, list);
	         return list;
	    }
	    
	    public void traverse(Node n, List<Integer> l) {
	        if(n == null) {
	        	return; 
	    	}
	 
	        traverse(n.left, l);
	        l.add(n.val);
	        traverse(n.right, l);
	  }

}
