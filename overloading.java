class A {
    public void f1(int x) {
        System.out.println("class A");
    }
}

class B extends A {
    public void f1(int x,int y)
    {
        System.out.println("class B");
    }
}

public class overloading {
    public static void main(String[] args) {
        B obj = new B();
        obj.f1(5);
        obj.f1(3, 4);
    }
}