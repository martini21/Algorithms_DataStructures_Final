public class BinarySearchTree<T extends Comparable<T>>
{
    public static Node root;

    public BinarySearchTree()
    {
        root = null;
    }

    public boolean insert(Node node)
    {
        //if no root set node as root
        if(root == null)
        {
            root = node;
            return true;
        }
        //else find a spot for the node
        else
        {
            Node currentnode = root;
            while(true)
            {
                //if data of node already exists return true
                if(node.getData().compareTo(currentnode.getData()) == 0)
                {
                    return true;
                }
                //if data of node is bigger than current node get right
                else if(node.getData().compareTo(currentnode.getData()) > 0)
                {
                    //if node null set the node
                    if(currentnode.getRight() == null)
                    {
                        currentnode.setRight(node);
                        return true;
                    }
                    //else change current node
                    else
                    {
                        currentnode = currentnode.getRight();
                    }
                }
                //if data of node is smaller than current node get left
                else if(node.getData().compareTo(currentnode.getData()) < 0)
                {
                    //if node null set the node
                    if(currentnode.getLeft() == null)
                    {
                        currentnode.setLeft(node);
                        return true;
                    }
                    //else change current node
                    else
                    {
                        currentnode = currentnode.getLeft();
                    }
                }

            }
        }
    }

    public boolean findNode(Node node)
    {
        Node currentnode = root;
        while(true)
        {
            //if data of currentnode is equal return true
            if(node.getData() == currentnode.getData())
            {
                return true;
            }
            //if data is bigger go right
            else if(node.getData().compareTo(currentnode.getData()) > 0)
            {
                //if node null return false
                if(currentnode.getRight() == null)
                {
                    return false;
                }
                //else set current to right
                else
                {
                    currentnode = currentnode.getRight();
                }
            }
            //if data is smaller go left
            else if(node.getData().compareTo(currentnode.getData()) < 0)
            {
                //if node null return false
                if(currentnode.getLeft() == null)
                {
                    return false;
                }
                //else set current to left
                else
                {
                    currentnode = currentnode.getLeft();
                }
            }
        }
    }

    public Node findinNodes(T value)
    {
        Node currentnode = root;
        while(true)
        {
            //if data of currentnode is equal return node
            if(currentnode.getData().compareTo(value) == 0)
            {
                return currentnode;
            }
            //if data is bigger go right
            else if(currentnode.getData().compareTo(value) < 0)
            {
                //if node null return null
                if(currentnode.getRight() == null)
                {
                    return null;
                }
                //else set current to right
                else
                {
                    currentnode = currentnode.getRight();
                }
            }
            //if data is smaller go left
            else if(currentnode.getData().compareTo(value) > 0)
            {
                //if node null return null
                if(currentnode.getLeft() == null)
                {
                    return null;
                }
                //else set current to left
                else
                {
                    currentnode = currentnode.getLeft();
                }
            }

        }
    }

    public int size()
    {
        return(size(root));
    }

    private int size(Node node)
    {
        //if node null return 0
        if (node == null) return(0);
        //else check the size of left and right and add one to count the node
        else
        {
            return(size(node.getLeft()) + 1 + size(node.getRight()));
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

