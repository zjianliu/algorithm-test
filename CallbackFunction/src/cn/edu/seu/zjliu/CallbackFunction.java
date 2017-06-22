package cn.edu.seu.zjliu;

/**
 * Created by 11363 on 6/22/2017.
 */

interface Father{
    void print();
}

class A{
    private Father ancestor;
    public void initiate(Father ancestor){
        this.ancestor = ancestor;
    }
    public void print(){
        ancestor.print();
    }
}

class B implements Father{
    @Override
    public void print() {
        System.out.println("A procedure has been designed, but we can change A behavior through B..");
    }
}

public class CallbackFunction {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        a.initiate(b);
        a.print();
    }
}
