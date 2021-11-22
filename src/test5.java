//Java Lambda Expression Example: No Parameter
interface Sayable{
    public String say();// here i am returning the string value///
}
 class LambdaExpressionExample3{
    public static void main(String[] args) {
        Sayable s=()->{// here i am implementing the concept of the lambda....
            //return ("I have nothing to say.");
            return ("I have nothing to say.");
        };
        System.out.println(s.say());
    }
}
