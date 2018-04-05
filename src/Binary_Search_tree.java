public class Binary_Search_tree {
    public static  Node root;
    public static void main(String[] args) {
        Binary_Search_tree bst = new Binary_Search_tree();
        Node node = new Node(15);
        Node node1 = new Node(7);
        Node node2 = new Node(6);
        Node node3 = new Node(9);
        Node node4 = new Node(48);
        Node node5 = new Node(19);
        Node node6 = new Node(22);
        Node node7 = new Node(32);
        Node node8 = new Node(75);
        Node node9 = new Node(500);
        insert(node1);
        insert(node2);
        insert(node3);
        insert(node4);
        insert(node5);
        insert(node6);
        insert(node7);
        insert(node8);
        find(node9);
    }
    public Binary_Search_tree(){
        this.root = null;
    }
    public static void insert(Node node){
        if(root == null){
            root = node;
            return;
        }
        else{
            Node currentnode = root;
            while(true){
                 if(node.getData() > currentnode.getData()){
                     if(currentnode.getRight() == null){
                         currentnode.setRight(node);
                         System.out.println("inserted " + node.getData() + " to the right of " + currentnode.getData());
                         return;
                     }
                     else {
                         currentnode = currentnode.getRight();
                     }
                 }
                 else if(node.getData() < currentnode.getData()){
                    if(currentnode.getLeft() == null){
                        System.out.println("inserted " + node.getData() + " to the left of " + currentnode.getData());
                        currentnode.setLeft(node);
                        return;
                    }
                    else {
                        currentnode = currentnode.getLeft();
                    }
                }
            }
        }
    }
    public static boolean find(Node node){
            Node currentnode = root;
            while(true){
                if(node.getData() > currentnode.getData()){
                    if(currentnode.getRight() == null){
                        System.out.println("not here");
                        return false;
                    }
                    else {
                        currentnode = currentnode.getRight();
                    }
                }
                else if(node.getData() < currentnode.getData()){
                    if(currentnode.getLeft() == null){
                        System.out.println("not here");
                        return false;
                    }
                    else {
                        currentnode = currentnode.getLeft();
                    }
                }
                else if(node.getData() == currentnode.getData()){
                    System.out.println(" here");
                    return true;
                }
            }
        }
    }

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
    public int getData(){
        return data;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public void setRight(Node node){
        right = node;
    }
    public void setLeft(Node node){
        left = node;
    }
}