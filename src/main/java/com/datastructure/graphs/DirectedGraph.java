package com.datastructure.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectedGraph {

    int vertex;
    int edges;
    int[][] adjMatrix;

    public DirectedGraph(int vertex) {
        this.vertex = vertex;
        this.edges = 0;
        this.adjMatrix = new int[vertex][vertex];

        for (int i = 0; i < this.vertex; i++) {
            for (int j = 0; j < this.vertex; j++) {
                adjMatrix[i][j] = -1;
            }
        }
    }

    public void addEdge(int v1, int v2, int weight) {
        this.adjMatrix[v1][v2] = weight;
        edges++;
    }

    public void removeEdge(int v1, int v2) {
        this.adjMatrix[v1][v2] = -1;
    }

    public void printGraph() {

        for(int i = 0; i < this.vertex ; i++) {
            System.out.println(Arrays.toString(adjMatrix[i]));
        }
    }

    public static void main(String[] args) {
        DirectedGraph teste = new DirectedGraph(4);
        teste.addEdge(0,1, 2);
        teste.addEdge(0,2, 1);
        teste.addEdge(1,0, 1);
        teste.addEdge(1,3, 1);
        teste.lowestWeight();
        teste.neighbord(1);
        teste.printGraph();
    }

    public void lowestWeight() {

        int[] minEdge = new int[2];
        minEdge[0] = -1;
        minEdge[1] = -1;
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < this.vertex; i++) {
            for (int j = 0; j< this.vertex; j++) {
                if (adjMatrix[i][j] != -1 && adjMatrix[i][j] < minCount) {
                    minEdge[0] = i;
                    minEdge[1] = j;
                    minCount = adjMatrix[i][j];
                }
            }
        }

        System.out.println(Arrays.toString(minEdge));
    }

    public void neighbord(int v) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < this.vertex; i++) {
            if (adjMatrix[v][i] != -1) {
                list.add(i);
            }
        }

        System.out.println(list);

    }
}
