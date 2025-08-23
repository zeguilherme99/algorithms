package com.datastructure.graphs;

import java.util.*;

public class Graph {

    int vertex;
    int edges;
    int[][] adjMatrix;

    public static void main(String[] args) {
        System.out.println("Graph data structure");
        Graph teste = new Graph(4);
        teste.addEdge(0,1);
        teste.addEdge(0,2);
        teste.addEdge(1,3);
        teste.addEdge(2,3);
        teste.addEdge(3,3);
//        teste.removeEdge(0,1);
        System.out.println(teste.degree(3));
        teste.printGraph();
        teste.listByDegree();
    }

    public Graph(int vertex) {
        this.edges = 0;
        this.vertex = vertex;
        this.adjMatrix = new int[vertex][vertex];

        for (int i = 0; i < this.vertex; i++) {
            adjMatrix[i] = new int[vertex];
            for (int j = 0; j < this.vertex; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void printGraph() {
        for (int i = 0; i < this.vertex; i++) {
            System.out.println(Arrays.toString(adjMatrix[i]));
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        this.adjMatrix[vertex1][vertex2] = 1;
        this.adjMatrix[vertex2][vertex1] = 1;
        edges++;
    }

    public void removeEdge(int vertex1, int vertex2) {
        adjMatrix[vertex1][vertex2] = 0;
        adjMatrix[vertex2][vertex1] = 0;
        edges--;
    }

    public int degree(int vertex) {
        int result = 0;

        for (int i = 0; i < this.vertex; i++) {
            if (adjMatrix[vertex][i] == 1) {
                result++;
            }
        }

        return result;
    }

    public void listByDegree() {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < this.vertex; i++) {
            int degree = this.degree(i);

            if (!map.containsKey(degree)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(degree, list);
            } else {
                map.get(degree).add(i);
            }
        }

        System.out.println(map);
    }
}
