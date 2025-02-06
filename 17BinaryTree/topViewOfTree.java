import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class topViewOfTree {
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

    public static class Info
    {
        int hd;
        Node node;
        Info(int hd , Node node)
        {
            this.hd=hd;
            this.node=node;
        }
    }
    public static void topView(Node root)
    {
        //level order
        Queue<Info> q = new LinkedList<>();
        int min =0;
        int max=0;
        HashMap<Integer,Node> mp = new HashMap<>();
        q.add(new Info(0, root));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!mp.containsKey(curr.hd))
                {
                    mp.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null)
                {
                    q.add(new Info(curr.hd-1, curr.node.left));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right!=null)
                {
                    q.add(new Info(curr.hd+1, curr.node.right));
                    max = Math.max(max, curr.hd+1);
                }

            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(mp.get(i).data + " ");
        }

    }
    public static void main(String[] args) {
        int[] Nodes = { 1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1 };
        BinaryTree BT = new BinaryTree();
        Node root = BT.buildTree(Nodes);
        topView(root);
    }
}
