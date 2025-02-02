package ex_04_Operators;

public class Lab_031_Concat_plus_operator {

    public static void main(String[] args) {
        int a = 10;
        int b =20;
        String firstname ="Madona";
        String lastname = "Jenifer";
        System.out.println(firstname + lastname); //behave concat in string literals
        System.out.println(a+b); // behave math operator
        System.out.println(firstname+lastname+a+b); //starting with string so concat operator behaves
        System.out.println(a+b+firstname+lastname); //starting with int so behaves like math operator
        System.out.println(firstname+lastname+(a+b)); // behaves math like BODMAS rule
    }
}
