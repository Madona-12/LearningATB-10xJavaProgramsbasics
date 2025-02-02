package ex_06_Ternary_Operator;

public class Lab_37_Nested_Ternary_Operators {
    public static void main(String[] args) {
        //result = condition1? expression1 : (condition2:expression2:expression3);
        int a =18;
        int b=61;
        int c=59;
        String S1= a>10 ? "Good" : ((a>11)? "yes":"no");
        String S2= b>60 ?"Senior citizen" : "Not a senior citizen" ;
        String S3=c>60?"Senior" : ((c>59)? "senior" : "Not senior");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
    }
}
