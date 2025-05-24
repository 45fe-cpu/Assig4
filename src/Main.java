<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");

        WeightedGraph<String> graph = new WeightedGraph<>();
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);

        graph.addEdge(a, b, 1.0);
        graph.addEdge(b, c, 2.5);
        graph.addEdge(a, c, 4.0);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        System.out.println("BFS Traversal:");
        bfs.bfs(a);

        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        System.out.println("Dijkstra Distances from  A:");
        var result = dijkstra.dijkstra(a);
        for (var entry : result.entrySet()) {
            System.out.println("To " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
>>>>>>> 424158f2c82cd61dacc7461904f738eb9fe4e140
