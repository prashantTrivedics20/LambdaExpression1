interface i1
{
    public void m1();
}
class Test1
{
    public static void main(String[] args) {
        i1 obj= () -> {
            System.out.println("hello");
        };
        obj.m1();
    }
}
