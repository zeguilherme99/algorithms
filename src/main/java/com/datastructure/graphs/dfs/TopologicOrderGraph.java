package com.datastructure.graphs.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TopologicOrderGraph {

    int vertex;
    int edges;
    List<Integer>[] adjascentList;

    public TopologicOrderGraph(int vertex) {
        this.vertex = vertex;
        this.edges = 0;
        adjascentList = new ArrayList[vertex];

        for (int i = 0; i < this.vertex; i++) {
            adjascentList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v1, int v2) {
        this.adjascentList[v1].add(v2);
    }

    public void dfsRecursive(int v, boolean[] visited, LinkedList<Integer> list) {
        visited[v] = true;
        System.out.println("Visited " + v);
        for (Integer w : neighbors(v)) {
            if (!visited[w]) {
                dfsRecursive(w, visited, list);
            }
        }
        list.addFirst(v);
    }

    public List<Integer> neighbors(int v) {
        return this.adjascentList[v];
    }

    public LinkedList<Integer> topOrder() {
        boolean[] visited = new boolean[this.vertex];
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < this.vertex; i++) {
            if (!visited[i]) {
                dfsRecursive(i, visited, linkedList);
            }
        }

        return linkedList;
    }

    public static void main(String[] args) {
        TopologicOrderGraph dfsGraph = new TopologicOrderGraph(10);

        dfsGraph.addEdge(0,1);
        dfsGraph.addEdge(0,2);
        dfsGraph.addEdge(0,5);
        dfsGraph.addEdge(1,2);
        dfsGraph.addEdge(2,3);
        dfsGraph.addEdge(2,4);
        dfsGraph.addEdge(4,6);
        dfsGraph.addEdge(5,6);
        dfsGraph.addEdge(5,4);
        dfsGraph.addEdge(9,6);
        dfsGraph.addEdge(6,8);
        dfsGraph.addEdge(6,7);
        dfsGraph.addEdge(7,8);

        System.out.println(dfsGraph.topOrder());
    }
}
