//Java Lambda Expression Example: Single Parameter
interface Sayable1{
    public String say(String name);
}

class LambdaExpressionExample4{
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable1 s1=(name)->{
            return "Hello, "+name;
        };
        String a=s1.say("Sonoo");
        System.out.println(a);

        // You can omit function parentheses(for single variable)
        Sayable1 s2= name ->{
            return "Hello, "+name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}
