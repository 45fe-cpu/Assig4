import java.util.*;

public class DijkstraSearch<T> {
    public Map<Vertex<T>, Double> dijkstra(Vertex<T> start) {
        Map<Vertex<T>, Double> distances = new HashMap<>();
        PriorityQueue<Vertex<T>> queue = new PriorityQueue<>(Comparator.comparingDouble(distances::get));

        for (Vertex<T> v : start.getAdjacentVertices().keySet()) {
            distances.put(v, Double.POSITIVE_INFINITY);
        }
        distances.put(start, 0.0);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();

            for (Map.Entry<Vertex<T>, Double> neighborEntry : current.getAdjacentVertices().entrySet()) {
                Vertex<T> neighbor = neighborEntry.getKey();
                double edgeWeight = neighborEntry.getValue();
                double newDistance = distances.get(current) + edgeWeight;

                if (newDistance < distances.getOrDefault(neighbor, Double.POSITIVE_INFINITY)) {
                    distances.put(neighbor, newDistance);
                    queue.add(neighbor);
                }
            }
        }

        return distances;
    }
}
