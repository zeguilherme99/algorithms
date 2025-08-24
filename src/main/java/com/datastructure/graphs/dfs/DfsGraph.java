package com.datastructure.graphs.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsGraph {

    int vertex;
    int edges;
    List<Integer>[] adjascentList;

    public DfsGraph(int vertex) {
        this.vertex = vertex;
        this.edges = 0;
        adjascentList = new ArrayList[vertex];

        for (int i = 0; i < this.vertex; i++) {
            adjascentList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v1, int v2) {
        this.adjascentList[v1].add(v2);
        this.adjascentList[v2].add(v1);
    }

    public void dfsRecursive(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println("Visited " + v);
        for (Integer w : neighbors(v)) {
            if (!visited[w]) {
                dfsRecursive(w, visited);
            }
        }
    }

    public void dfsIterative(int v) {
        boolean[] visited = new boolean[this.vertex];
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v] = true;

        while (!stack.empty()) {
            v = stack.pop();
            System.out.println("Visited " + v);

            for (Integer w : neighbors(v)) {
                if (!visited[w]) {
                    stack.push(w);
                    visited[w] = true;
                }
            }
        }
    }

    public List<Integer> neighbors(int v) {
        return this.adjascentList[v];
    }

    public static void main(String[] args) {
        DfsGraph dfsGraph = new DfsGraph(5);

        dfsGraph.addEdge(0,1);
        dfsGraph.addEdge(0,2);
        dfsGraph.addEdge(0,3);
        dfsGraph.addEdge(2,3);
        dfsGraph.addEdge(2,4);
        dfsGraph.addEdge(3,4);

        boolean[] visited = new boolean[dfsGraph.vertex];
        dfsGraph.dfsRecursive(0,visited);
        dfsGraph.dfsIterative(0);
    }
}
