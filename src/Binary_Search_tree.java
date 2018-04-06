public class Binary_Search_tree<T extends Comparable<T>> {
    public static  Node root;
    public static void main(String[] args) {
    }
    public Binary_Search_tree(){
        this.root = null;
    }
    public Node getRoot(){
        return root;
    }
    public boolean insert(Node node){
        if(root == null){
            root = node;
            return true;
        }
        else{
            Node currentnode = root;
            while(true){
                 if(node.getData().compareTo(currentnode.getData()) == 0){
                    return true;
                 }
                 else if(node.getData().compareTo(currentnode.getData()) > 0){
                     if(currentnode.getRight() == null){
                         currentnode.setRight(node);
                         return true;
                     }
                     else {
                         currentnode = currentnode.getRight();
                     }
                 }
                 else if(node.getData().compareTo(currentnode.getData()) < 0){
                    if(currentnode.getLeft() == null){
                        currentnode.setLeft(node);
                        return true;
                    }
                    else {
                        currentnode = currentnode.getLeft();
                    }
                }

            }
        }
    }
    public boolean findNode(Node node){
            Node currentnode = root;
            while(true){
                if(node.getData() == currentnode.getData()){
                    System.out.println("here");
                    return true;
                }
                else if(node.getData().compareTo(currentnode.getData()) > 0){
                    if(currentnode.getRight() == null){
                        System.out.println("not here");
                        return false;
                    }
                    else {
                        currentnode = currentnode.getRight();
                    }
                }
                else if(node.getData().compareTo(currentnode.getData()) < 0){
                    if(currentnode.getLeft() == null){
                        System.out.println("not here");
                        return false;
                    }
                    else {
                        currentnode = currentnode.getLeft();
                    }
                }
            }
        }
    public Node findinNodes(T value){
        Node currentnode = root;
        while(true){
            if(currentnode.getData().compareTo(value) == 0){
                System.out.println("here");
                return currentnode;
            }
            else if(currentnode.getData().compareTo(value) < 0){
                if(currentnode.getRight() == null){
                    System.out.println("not here");
                    return null;
                }
                else {
                    currentnode = currentnode.getRight();
                }
            }
            else if(currentnode.getData().compareTo(value) > 0){
                if(currentnode.getLeft() == null){
                    System.out.println("not here");
                    return null;
                }
                else {
                    currentnode = currentnode.getLeft();
                }
            }

        }
    }
}

class Node<T extends Comparable<T>>{
    private T value;
    private Node left;
    private Node right;
    public Node(T value){
        this.value = value;
        left = null;
        right = null;
    }
    public T getData(){
        return value;
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