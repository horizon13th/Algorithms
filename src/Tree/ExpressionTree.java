package Tree;

public class ExpressionTree {
	public static void main(String[] args) {
		ExpTreeNode r = new ExpTreeNode("+");
		r.left = new ExpTreeNode("*");                                                                       
		r.left.left = new ExpTreeNode("1");
		r.left.right = new ExpTreeNode("3");
		r.right = new ExpTreeNode("3");   
		System.out.println(postorderTraversal(r));
	}
    public static double postorderTraversal(ExpTreeNode t){
        if(t==null) return 0;
        if(Character.isDigit(t.val.charAt(0)) && t.right==null && t.left==null)
        	return Integer.parseInt(t.val);
        double left = postorderTraversal(t.left);
        double right = postorderTraversal(t.right);
        return cal(left, right, t.val);
    }
    public static double cal(double a, double b, String op){
    	double result = 0;
    	switch(op){
    		case "+": 
    			result = a+b;
    			break;
    		case "-": 
    			result = a-b;
    			break;
    		case "*": 
    			result = a*b;
    			break;
    		case "/": 
    			result = a/b;
    			break;
    	}
    	System.out.println(op+""+ a+""+ b);
    	return result;
    }
    }

