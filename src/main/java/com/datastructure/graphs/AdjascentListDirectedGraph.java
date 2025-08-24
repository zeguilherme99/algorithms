package com.datastructure.graphs;

import java.util.*;

public class AdjascentListDirectedGraph {

    int vertex;
    int edges;
    List<List<Integer>>[] list;

    public AdjascentListDirectedGraph(int vertex) {
        this.vertex = vertex;
        list = new ArrayList[vertex];
        this.edges = 0;

        for (int i = 0; i < this.vertex; i++) {
            list[i] = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        AdjascentListDirectedGraph teste = new AdjascentListDirectedGraph(5);
        teste.addEdge(0,1, 4);
        teste.addEdge(0,2, 5);
        teste.addEdge(0,3, 3);
        teste.addEdge(4,3, -5);
//        teste.addEdge(2,3,2);
//        teste.addEdge(4,3);
        teste.removeEdge(0,2);
        teste.printGraph();
        System.out.println(teste.degree(0));
        teste.listDegree();
        teste.lowestWeigh();
        teste.neighbours(0);
    }

    public void addEdge(int v1, int v2, int weigh) {
        list[v1].add(List.of(v2, weigh));
        edges++;
    }

    public void removeEdge(int v1, int v2) {
        this.list[v1] = new ArrayList<>(this.list[v1].stream().filter(v-> !Objects.equals(v.get(0), v2)).toList());
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

    public void lowestWeigh() {

        int minCount = Integer.MAX_VALUE;
        int[] minEdge = new int[3];
        minEdge[0] = -1;
        minEdge[1] = -1;

        for (int i = 0; i < this.vertex ; i++ ){
            for (int j = 0; j < this.list[i].size() ; j++) {
                if (this.list[i].get(j).get(1) < minCount) {
                    minCount = this.list[i].get(j).get(1);
                    minEdge[0] = i;
                    minEdge[1] = this.list[i].get(j).get(0);
                    minEdge[2] = this.list[i].get(j).get(1);
                }
            }
        }

        System.out.println(Arrays.toString(minEdge));
    }

    public void neighbours(int vertex) {
        List<Integer> teste = this.list[vertex].stream().map(v -> v.get(0)).toList();
        System.out.println(teste);
    }
}
