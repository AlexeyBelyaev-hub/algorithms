package stack.clonegraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public Node cloneGraph(Node node) {

        Map<Node, Node> visited = new HashMap<>();
        return dfs(node, visited);
    }

    private Node dfs(Node node, Map<Node,Node> visited) {
        if (visited.containsKey(node) || node == null)
            return visited.get(node);
        Node newNode = new Node(node.val);
        visited.put(node, newNode);
        ArrayList<Node> newNeighbors = new ArrayList<>();
        for(Node nextNode : node.neighbors) {
            newNeighbors.add(dfs(nextNode, visited));
        }
        newNode.neighbors = newNeighbors;
        return newNode;
    }
}
