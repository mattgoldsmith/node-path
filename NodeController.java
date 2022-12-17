import java.util.ArrayList;

public class NodeController {

    ArrayList<Node> nodeList;

    public NodeController() {

        nodeList = new ArrayList<>();
        createNodes();
//        System.out.println(nodeList);
        printNodeList();
    }

    private void createNodes() {

        int a = 1; //Continent
        int b = 0; //Country
        int c = 0; //Region
        int d = 0; //City
        int e = 0; //Town
        int f = 0; //ID
        while (a < 2) {

            addNode(a, b, c, d, e, f);

            if(e != 0) {
                f++;
                if(f > 6) {
                    f = 0;
                }
                else {
                    continue;
                }
            }
            if(d != 0) {
                e++;
                if(e > 6) {
                    e = 0;
                }
                else {
                    continue;
                }
            }
            if(c != 0) {
                d++;
                if(d > 6) {
                    d = 0;
                }
                else {
                    continue;
                }
            }
            if(b != 0) {
                c++;
                if(c > 6) {
                    c = 0;
                }
                else {
                    continue;
                }
            }
            if(a != 0) {
                b++;
                if(b > 6) {
                    b = 0;
                }
                else {
                    continue;
                }
            }
            a++;
        }
    }

    private void addNode(int a, int b, int c, int d, int e, int f) {
        String id = a + Integer.toString(b) + c + d + e + f;
        nodeList.add(new Node(Integer.parseInt(id) ));
    }

    private void printNodeList() {
        for (Node node: nodeList) {
            System.out.println(node.getId());
        }
    }
}
