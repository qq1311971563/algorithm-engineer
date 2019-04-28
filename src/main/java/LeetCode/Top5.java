package LeetCode;

import java.util.List;

public class Top5 {

    /**
     * 559 N叉数的最大深度
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if(root.children == null || root.children.size() == 0){
            return 1;
        }
        int max = 0;
        //所有的路都走了一遍
        for (int i = 0; i < root.children.size(); i++) {
            Node node = root.children.get(i);
            max = Math.max(max,1 + maxDepth(node));
        }

        return max;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
