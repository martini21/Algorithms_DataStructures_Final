
/*
import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    private Binary_Search_tree bst;

    @org.junit.Before
    public void Before()
    {
        this.bst = new Binary_Search_tree();
    }

    @org.junit.Test
    public void isFull()
    {
        this.queue.enqueue(5);
        this.queue.enqueue(5);
        this.queue.enqueue(5);
        assertTrue(this.queue.isFull());
        this.queue.dequeue();
        assertFalse(this.queue.isFull());
    }
}*/

import java.io.IOException;
import java.util.Random;

public class BinarySearchTreeTest {
    private Binary_Search_tree bst;
    public static void main(String[] args){
        BinarySearchTreeTest bsttest = new BinarySearchTreeTest();
        bsttest.insertNodes();
        bsttest.findRandom();
    }
    BinarySearchTreeTest(){
        this.bst = new Binary_Search_tree();
    }
    public void insertNodes(){
       try{
           new Legocsv().readFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        for (LegoItem item : Legocsv.itemsArray ) {
            bst.insert(new Node(item.getUsd_msrp()));
        }
    }
    public void findRandom(){
        //Find a node using a random msrp value and then find the same node
    bst.findNode(bst.findinNodes(Legocsv.itemsArray[new Random().nextInt(Legocsv.itemsArray.length)].getUsd_msrp()));

    }
}