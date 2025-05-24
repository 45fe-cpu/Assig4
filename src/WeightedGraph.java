import java.util.*;

public class WeightedGraph<T> {
    private List<Vertex<T>> vertices;

    public WeightedGraph() {
        vertices = new ArrayList<>();
    }

    public void addVertex(Vertex<T> vertex) {
        vertices.add(vertex);
    }

    public void addEdge(Vertex<T> source, Vertex<T> dest, double weight) {
        source.addAdjacentVertex(dest, weight);
    }

    public List<Vertex<T>> getVertices() {
        return vertices;
    }
}
