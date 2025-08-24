package com.datastructure.graphs;

import java.util.*;

public class AdjascentListGraph {

    int vertex;
    int edges;
    List<Integer>[] list;

    public AdjascentListGraph(int vertex) {
        this.vertex = vertex;
        list = new ArrayList[vertex];
        this.edges = 0;

        for (int i = 0; i < this.vertex; i++) {
            list[i] = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        AdjascentListGraph teste = new AdjascentListGraph(5);
        teste.addEdge(0,1);
        teste.addEdge(0,2);
        teste.addEdge(4,3);
        teste.removeEdge(2,2);
        teste.printGraph();
        System.out.println(teste.degree(0));
        teste.listDegree();
    }

    public void addEdge(int v1, int v2) {
        list[v1].add(v2);
        list[v2].add(v1);
        edges++;
    }

    public void removeEdge(Integer v1, Integer v2) {
        list[v1].remove(v2);
        list[v2].remove(v1);
        edges--;
    }

    public void printGraph() {
        for (int i = 0; i< this.vertex; i++) {
            System.out.println(i + " -> " + this.list[i]);
        }
    }

    public int degree(int v) {
//        System.out.println(list[v].size());
        return list[v].size();
    }

    public void listDegree() {

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
