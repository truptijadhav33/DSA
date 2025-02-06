public class diameterOfTree {
    static public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static public class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = height(root.right);
        int rh = height(root.right);
        return Math.max( lh+rh+1 , Math.max(ld , rd) );
    }
    public static void main(String[] args) {
        int[] Nodes = { 1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1 };
        BinaryTree BT = new BinaryTree();
        Node root = BT.buildTree(Nodes);
        System.out.println(diameter(root));
    }
}
