package arbolBinario;

public class arbolBinario {
    
    protected node root;

    public arbolBinario(){
        root = null;
    }

    public arbolBinario(Object fact){
        this.root = new node(fact);
    }

    //methods
    public node findNode(Object fact){
        node current = root;
        int nodedata = Integer.parseInt((String.valueOf(fact)));

        while(current != null){

            if(nodedata<Integer.parseInt((current.fact.toString()))){
                current = current.leftBranch;
            }else if(nodedata>Integer.parseInt((current.fact.toString()))){
                current = current.rightBranch;
            }else if(Integer.parseInt(current.toString())==nodedata){
                return current;
            }

        }
        return null;
    }

    public void insert(node Node){

        node current = root;
        node previus = new node(null);
        int nodedata = Integer.parseInt((Node.fact.toString()));

        while(current != null){
            previus = current;
            if(nodedata<Integer.parseInt((current.fact.toString()))){
                current = current.leftSubtree();
            }else if(nodedata>Integer.parseInt((current.fact.toString()))){
                current = current.rightSubtree();
            }else{
                System.out.println("\n Lo ingresado ya pertenece al arbol");
            }
        }
        if(nodedata>Integer.parseInt((previus.fact.toString()))){
            previus.rightBranch = Node;
        }else if(nodedata<Integer.parseInt((previus.fact.toString()))){
            previus.leftBranch = Node;
        }else {
            System.out.println("\n Lo ingresado ya pertenece al arbol");
        }

    }

    public void remove(Object fact){
        node rem = findNode(fact);

        if(rem.leftSubtree() != null){
            node leftAux = rem.leftSubtree();
            insert(leftAux);
        }else if(rem.rightSubtree() != null){
            node rightAux = rem.rightSubtree();
            insert(rightAux);
        }
        System.out.println("\n El nodo seleccionado se ha eliminado correctamente ");
    }

    ///tours
    public static void preOrden(node Node){
        System.out.println("\n ["+String.valueOf(Node)+"] ");

        if(Node.leftSubtree() != null){
            preOrden(Node.leftSubtree());
        }
        if(Node.rightSubtree() != null){
            preOrden(Node.rightSubtree());
        }
    }

    public static void inOrden(node Node){

        if(Node.leftSubtree() != null){
            inOrden(Node.leftSubtree());
        }
        System.out.println(" ["+String.valueOf(Node)+"] ");
        if(Node.rightSubtree() != null){
            inOrden(Node.rightSubtree());
        }
    }

    public static void postOrden(node Node){
        if(Node.leftSubtree() != null){
            postOrden(Node.leftSubtree());
        }
        if(Node.rightSubtree() != null){
            postOrden(Node.rightSubtree());
        }
        System.out.println(" ["+String.valueOf(Node)+"] ");
    }

}
