public class Test2 extends Test1{

    static {
        System.out.println(4);
    }
    {
        System.out.println(5);
    }
    public Test2() {
        System.out.println(6);
        i = 11;
    }

    public static void main(String[] args) {
        System.out.println(new Test2().i);
    }
}
