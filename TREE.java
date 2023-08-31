import java.util.*;

class BinarySearchTree {
    Node root;

    class Node {
        int data;
        Node right;
        Node left;

        Node(int val) {
            data = val;
            right = null;
            left = null;
        }
    }

    Node insert(Node node, int val) {
        if(node == null) {
            return new Node(val);
        }
        if(val < node.data) {
            node.left = insert(node.left, val);
        }
        else {
            node.right = insert(node.right, val);
        }
        return node;
    }

    int height(Node node) {
        if(node == null) {
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);

        if(lh > rh) {
            return lh+1;
        }
        else {
            return rh+1;
        }
    }

    void inOrder(Node node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(Node node) {
        if(node == null) {      
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
     List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    void rightView(Node curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
        
    }
      List<Integer> leftSideView(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        leftView(root, result, 0);
        return result;
    }
    
    void leftView(Node curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
         leftView(curr.left, result, currDepth + 1);
        leftView(curr.right, result, currDepth + 1);
       
    }
 
}

class Solution {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int n = scn.nextInt();
        int values[] = new int[n];
        for(int i = 0; i < n; i++) {
            values[i] = scn.nextInt();
        }
        for(int val: values) {
            bst.root = bst.insert(bst.root, val);
        }
        System.out.println(bst.leftSideView(bst.root));
        scn.close();
    }
}