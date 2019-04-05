public class BinarySearchTree
{
    Node root;
    Node target;
    Node parent;
    public BinarySearchTree(){root=null;}

    public void addNode(BinaryCountNode v){
        parent=root;
        target=root;
        if (root==null) {
            root = new Node(v);
        } else
            while(true){


                if(v.type.compareTo(parent.value.type)<0) {
                    if (parent.rchild == null) {
                        parent.rchild = new Node(v);
                        return;
                    } else parent=parent.rchild;
                } else{
                    if(parent.lchild==null) {
                        parent.lchild = new Node(v);
                        return;
                    }else parent=parent.lchild;

                }
            }


    }

    public class Node{
        BinaryCountNode value;
        Node rchild;
        Node lchild;

        Node(BinaryCountNode v){
            this.value=v;
            rchild=null;
            lchild=null;
        }



//public void rNode(Node lchild) {this.lchild = lchild;}

//public void lNode(Node rchild) {this.rchild = rchild;}
    }
    public String toString() {
        return HamburgerHelper(this.root);

    }
    public String HamburgerHelper(Node n){

        String no="";
        Node tar;
        tar=n;

        {
            no+=tar.value+" ";
            if(tar.lchild==null)
                System.out.print("");
            else no+=HamburgerHelper(tar.lchild);
            if(tar.rchild==null)
                System.out.print("");
            else no+=HamburgerHelper(tar.rchild);

        }
        return no;


    }
    public int find(BinaryCountNode v){
        parent=root;
//target=root;
        int ct=0;
        if(v==parent.value)
        {ct++;
            return ct;
        }else ct++;
        while(true){



            if(v.type.compareTo(parent.value.type)<0) {
                if (parent.rchild == null) {
                    return -1;
                } else if(parent.rchild.value==v){
                    ct++; return ct;
                }
                else{ parent=parent.rchild; ct++;}
            } else{
                if (parent.lchild == null) {
                    return -1;
                } else if(parent.lchild.value==v){
                    ct++; return ct;
                }
                else{ parent=parent.lchild; ct++;}
            }
        }

    }
    public String inorder(Node n){
        String no="";
        Node tar;
        tar=n;

        {

            if(tar.lchild==null)
                System.out.print("");
            else no+=inorder(tar.lchild);
            no+=tar.value+" ";
            if(tar.rchild==null)
                System.out.print("");
            else no+=inorder(tar.rchild);
        }
        return no;


    }
    public String reorder(Node n){
        String no="";
        Node tar;
        tar=n;

        {

            if(tar.rchild==null)
                System.out.print("");
            else no+=reorder(tar.rchild);
            no+=tar.value+" ";
            if(tar.lchild==null)
                System.out.print("");
            else no+=reorder(tar.lchild);
        }
        return no;


    }
    public String post(Node n){

        String no="";
        Node tar;
        tar=n;

        {

            if(tar.lchild==null)
                System.out.print("");
            else no+=post(tar.lchild);
            if(tar.rchild==null)
                System.out.print("");
            else no+=post(tar.rchild);
            no+=tar.value+" ";
        }
        return no;


    }
    public int Nodes(Node n){

        int no=0;
        Node tar;
        tar=n;

        {
            no++;
            if(tar.lchild==null)
                System.out.print("");
            else no+=Nodes(tar.lchild);
            if(tar.rchild==null)
                System.out.print("");
            else no+=Nodes(tar.rchild);
        }
        return no;


    }
    public int Parents(Node n){

        int no=0;
        Node tar;
        tar=n;

        {//THE FOLLOWING IF STATEMENT WILL HEREINAFTER BE REFERRED TO AS "THE DISENFRANCHISEMENT CLAUSE"
            if(tar.lchild!=null||tar.rchild!=null)//put in for the sole purpose of disenfranchising the bottom ones
                no++;
            if(tar.lchild==null)
                System.out.print("");
            else no+=Parents(tar.lchild);
            if(tar.rchild==null)
                System.out.print("");
            else no+=Parents(tar.rchild);
        }
        return no;


    }
    public int Leaves(Node n){

        int no=0;
        Node tar;
        tar=n;

        {

            if(tar.rchild==null)
                System.out.print("");
            else {no++; no+=Leaves(tar.rchild);}
            if(tar.lchild==null)
                System.out.print("");
            else {no++; no+=Leaves(tar.lchild);}
        }
        return no;


    }
    /*
    public int large(Node n){
        String no=n.value;
        Node tar;
        tar=n;

        {

            if(tar.lchild==null)
                System.out.print("");
            else if(no<large(tar.lchild))
                no=large(tar.lchild);
//no+=tar.value;
            if(tar.rchild==null)
                System.out.print("");
            else if(no<large(tar.rchild))
                no=large(tar.rchild);
        }
        return no;
    }

    public int small(Node n){
        int no=n.value;
        Node tar;
        tar=n;

        {

            if(tar.lchild==null)
                System.out.print("");
            else if(no>small(tar.lchild))
                no=small(tar.lchild);
//no+=tar.value;
            if(tar.rchild==null)
                System.out.print("");
            else if(no>small(tar.rchild))
                no=small(tar.rchild);
        }
        return no;
    }
    public int total(Node n){
        int no=0;
        Node tar;
        tar=n;

        {

            if(tar.rchild==null)
                System.out.print("");
            else no+=total(tar.rchild);
            no+=tar.value;
            if(tar.lchild==null)
                System.out.print("");
            else no+=total(tar.lchild);
        }
        return no;
    }*/

}