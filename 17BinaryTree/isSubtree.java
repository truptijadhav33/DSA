public class isSubtree {
    public static  class Node {
        public int data;
        public Node left;
        public Node right;

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
        public boolean isIdentical(Node root , Node subRoot)
        {
            if(root==null && subRoot==null)
            {
                return true;
            }
            else if(root==null || subRoot==null || root.data!=subRoot.data)
            {
                return false;
            }
            if(!isIdentical(root.left, subRoot.left))
            {
                return false;
            }
            if (!isIdentical(root.right, subRoot.right)) {
                return false;
            }

            return true;

        }
        public boolean isSubtree(Node root , Node subRoot)
        {
            if(root==null)
            {
                return false;
            }
            if(root.data==subRoot.data)
            {
                if(isIdentical(root,subRoot))
                {
                    return true;
                }
            }

            return isSubtree(root.left , subRoot) || isSubtree(root.right,subRoot);
        }
    }

    public static void main(String[] args) {
        // int[] Nodes = { 1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1 };
        // BinaryTree BT = new BinaryTree();
        // Node root = BT.buildTree(Nodes);
        // System.out.println(root.data);
        Node root = new Node(1);
        root.left = new Node(2);
       root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left= new Node(4);
        subroot.right = new Node(9);

        BinaryTree BT = new BinaryTree();
        System.out.println(BT.isSubtree(root, subroot));

    }
}
