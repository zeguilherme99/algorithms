package com.datastructure.graphs.bfs;

import java.util.*;

public class BfsGraph {

    int vertex;
    int edges;
    List<Integer>[] adjList;

    public BfsGraph(int vertex) {
        this.vertex = vertex;
        adjList = new ArrayList[vertex];
        edges = 0;
        for(int i =0 ; i < this.vertex; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v1, int v2) {
        this.adjList[v1].add(v2);
        this.adjList[v2].add(v1);
        edges++;
    }

    public List<Integer> neighbors(int v) {
        return this.adjList[v];
    }

    public void bfs(int vertex) {
        boolean[] visited = new boolean[this.vertex];
        visited[vertex] = true;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(vertex);

        while (!queue.isEmpty()) {
            vertex = queue.poll();
            System.out.println("Visited " + vertex );
            for(int i = 0; i < neighbors(vertex).size(); i++) {
                if (!visited[neighbors(vertex).get(i)]) {
                    queue.add(neighbors(vertex).get(i));
                    visited[neighbors(vertex).get(i)] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        BfsGraph graph = new BfsGraph(6);
        graph.addEdge(0,1);
        graph.addEdge(0,5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,5);
        graph.addEdge(2,3);
        graph.addEdge(2,5);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);

        graph.bfs(1);
    }

}
