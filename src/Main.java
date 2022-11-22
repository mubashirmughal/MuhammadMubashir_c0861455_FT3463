abstract class ArithmeticExp {
    private int type;
    private int value1;
    private int value2;
    private ArithmeticExp left;
    private ArithmeticExp right;

}
class number extends ArithmeticExp{


}
class sum extends ArithmeticExp{

}
class product extends ArithmeticExp{

}

abstract class binary {

}


public class Main {
    public static void main(String[] args)
    {
        ArithmeticExp term = new ArithmeticExp(TYPE_SUM, 0,
                new ArithmeticExp(TYPE_NUMBER, 3, null, null),
                new ArithmeticExp(TYPE_PROD, 0,
                        new ArithmeticExp(TYPE_NUMBER, 2, null, null),
                        new ArithmeticExp(TYPE_NUMBER, 5, null, null)));
        System.out.println(evaluate(term));
    }
}
