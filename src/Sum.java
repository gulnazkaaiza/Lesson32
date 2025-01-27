public class Sum {
    int countLeaves(Node node) {
        if (node == null)
            return 0;
        else if (node.left != null || node.right != null) {
            return countLeaves(node.left) + countLeaves(node.right);
        } else {
            return 1;
        }
    }
}
