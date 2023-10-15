package arrays;
import java.util.*;

class Graph {
    private int V;
    private LinkedList<Edge>[] adjList;

    Graph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    void addEdge(int src, int dest, int weight) {
        adjList[src].add(new Edge(dest, weight));
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (Edge edge : adjList[i]) {
                System.out.print(edge.dest + "(" + edge.weight + ") ");
            }
            System.out.println();
        }
    }


//public class MainGraph {
    public static void main(String[] args) {
        int V = 6; // Количество вершин

        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 1);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(3, 5, 3);
        graph.addEdge(4, 5, 1);





        graph.printGraph();
    }
}
/*
Необходимо реализовать на джава такой граф - https://kpolyakov.spb.ru/school/test10bu/4_files/numway2.gif

В этом примере, создается класс Graph, внутри которого определен внутренний класс Edge для представления рёбер.
Метод addEdge добавляет рёбра, а printGraph выводит информацию о связях каждой вершины.
Запустив этот код, вы увидите вывод, который отражает структуру графа, представленного на вашей картинке.
 */