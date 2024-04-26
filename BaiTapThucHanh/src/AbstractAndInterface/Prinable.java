package AbstractAndInterface;

public interface Prinable {
    void print();
}
class A6 implements Prinable{
    public void print(){
        System.out.println("Hello" );
    }
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}
