package ex_06_Ternary_Operator;

public class Lab036_Ternary_operators {
    public static void main(String[] args) {
        //result = condition?expression1:expression2
        int age = 25;
        String result = age>=18? "Yes you can vote" : "No you cant vote";
        System.out.println(result);
    }
}
