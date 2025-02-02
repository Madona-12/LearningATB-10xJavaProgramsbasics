package ex_05_Types_of_casting;

public class Lab035_explicit_casting {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;
       float total =course +GST; //implicit (widening-mostly used)
        System.out.println(total);
        int total1 = course + (int)GST ; //explicit (narrowing-data loss for some values)
        System.out.println(total1);
    }
}
