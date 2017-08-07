package cn.edu.seu.zjliu;

/**
 * Created by 11363 on 7/26/2017.
 */

class Node{
    int value;
    Node left;
    Node right;
}

public class BinaryTree {
    public static int getNodeNum(Node tree){
        int num = 0;
        if(tree == null)
            return 0;
        if(tree.left != null){
            num++;
            getNodeNum(tree.left);
        }
        if(tree.right != null){
            num++;
            getNodeNum(tree.right);
        }
        return num;
    }

    public static void main(String[] args){
        int[] tree = {3,7,8,12,'#',5,13,'#','#',6};
        
    }

}
