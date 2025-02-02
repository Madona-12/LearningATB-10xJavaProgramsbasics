package ex_04_Operators;

public class Lab_030_Logical_Operators {
    public static void main(String[] args) {

        boolean a =true;
        System.out.println(!a);
        boolean b=false;
        System.out.println(!!b);
        boolean c =true||false; // OR gate
        // 0 1 = 1
        // 1 0 = 1
        // 1 1 = 1
        // 0 0 = 0
        System.out.println(c);
        boolean d =true && false; //AND gate
        // 1 1 = 1
        // 1 0 = 0
        // 0 1 = 0
        // 0 0 = 0
        System.out.println(d);
        boolean e = true && true;
        System.out.println(e);
    }
}
