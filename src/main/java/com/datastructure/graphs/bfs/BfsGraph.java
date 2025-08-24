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

    public void bfs(int vertex, boolean[] visited) {
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

    public int conectedComponents() {
        int count = 0;
        boolean[] visited = new boolean[this.vertex];

        for (int i = 0; i < this.vertex; i++) {
            if (!visited[i]) {
                bfs(i, visited);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        BfsGraph graph = new BfsGraph(7);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(2,6);
        graph.addEdge(3,4);
//        graph.addEdge(1,5);
//        graph.addEdge(2,3);
//        graph.addEdge(2,5);
//        graph.addEdge(3,4);
//        graph.addEdge(3,5);
//        graph.addEdge(4,5);

        System.out.println(graph.conectedComponents());
    }

}
