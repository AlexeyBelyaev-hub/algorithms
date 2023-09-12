package stack.clonegraph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CloneGraphTest {


    /**
     * Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
     * Output: [[2,4],[1,3],[2,4],[1,3]]
     * Explanation: There are 4 nodes in the graph.
     * 1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
     * 2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
     * 3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
     * 4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
     */
    @Test
    void cloneGraphEx1() {
        int[][] adjList = {{2,4},{1,3},{2,4},{1,3}};

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        ArrayList<Node> node1Nbrs= new ArrayList<>();
        node1Nbrs.add(node2);
        node1Nbrs.add(node4);

        ArrayList<Node> node2Nbrs= new ArrayList<>();
        node2Nbrs.add(node1);
        node2Nbrs.add(node3);

        ArrayList<Node> node3Nbrs= new ArrayList<>();
        node3Nbrs.add(node2);
        node3Nbrs.add(node3);

        ArrayList<Node> node4Nbrs= new ArrayList<>();
        node4Nbrs.add(node3);
        node4Nbrs.add(node1);

        node1.neighbors = node1Nbrs;
        node2.neighbors = node2Nbrs;
        node3.neighbors = node3Nbrs;
        node4.neighbors = node4Nbrs;

        CloneGraph cloneGraph = new CloneGraph();
        Node newNode1 = cloneGraph.cloneGraph(node1);
        Node curNewNode = newNode1;
        Node curNode = node1;
        do {
            Assertions.assertNotEquals(curNode, curNewNode);
            Assertions.assertEquals(curNode.val, curNewNode.val);
            curNewNode = curNewNode.neighbors.get(1);
            curNode = curNode.neighbors.get(1);
        } while (curNewNode != newNode1);

    }
}