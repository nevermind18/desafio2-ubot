public class Main {

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        avlTree.insert(15);
        avlTree.insert(3);
        avlTree.insert(2);
        avlTree.insert(1);
        avlTree.insert(8);
        avlTree.insert(5);
        avlTree.insert(7);

        System.out.println("Arvore balanciada");
        avlTree.inorderTraversal();

        System.out.println(avlTree.toString());
    }

}