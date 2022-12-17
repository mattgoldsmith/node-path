import java.util.ArrayList;

public class Node {

    private final Integer id;
    private ArrayList<Integer> connections;

    public Node(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Integer> getConnections() {
        return connections;
    }

    public void addConnection(int connectionId) {
        connections.add(connectionId);
    }
}
