interface test10 {
    int a = 20;
    public void m2();
}
class test11
    {
        public static void main(String[] args) {
            int b=30;
        test10 obj=()-> System.out.println(test10.a+b);// always keep in the mind here i am not creating the object
        // if you want to access the value of (a) then by using the
            // interface name we access...
            // if we are using the lambda expression with local variable then lambda expression make this local
            // variable "final"
        obj.m2();

    }
}
