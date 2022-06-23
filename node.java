package arbolBinario;
public class node{

    protected Object fact;
    protected node leftBranch;
    protected node rightBranch;

    public node(Object worth){
        fact = worth;
        this.leftBranch = null;
        this.rightBranch = null;
    }

    public String toString(){
        return String.valueOf(fact);
    }

    //get
    public Object nodeValue(){
        return fact;
    }
    public node leftSubtree(){
        return leftBranch;
    }
    public node rightSubtree(){
        return rightBranch;
    }

    //set
    public void newValue(Object f){
        fact = f;
    }
    public void leftBranch(node lb){
        leftBranch = lb;
    }
    public void rightBranch(node rb){
        rightBranch = rb;
    }
}
