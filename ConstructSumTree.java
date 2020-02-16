Tree<Integer> constructSumTree(Tree<Integer> t) {
   
         helperMethod(t, t, t);
        return t;
    
   
}
void helperMethod(Tree<Integer> t, Tree<Integer> parent, Tree<Integer> root) {
        if (t == null) {
            return;
        } 
    
        if (t.left == null && t.right == null  ) {
            parent.value += t.value;
            t.value = 0;
        } 
        
        if (t.left != null && t.left.value != 0) helperMethod(t.left, t, root);
         if (t.right != null && t.right.value != 0)  helperMethod(t.right, t, root);
        if (t.left == null && t.right == null && parent == t) t.value = 0;
        if (t.left != null && t.left.value != 0) t.value += t.left.value;
        if (t.right != null && t.right.value != 0)t.value += t.right.value;
    
    }
    

