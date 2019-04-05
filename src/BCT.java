import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BCT {
    BinarySearchTree tree;
    public BCT()
    {
        tree= new BinarySearchTree();
    }
    public void addNode(BinaryCountNode b){
        tree.addNode(b);
    }

    public ArrayList getAllCards(){
        ArrayList all=new ArrayList();
        all.add(tree.HamburgerHelper(tree.root));
        System.out.println(""+tree.HamburgerHelper(tree.root));
        return all;
    }


}
