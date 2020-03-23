package day23;

public class SbEqualMethod {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Techtorial");
        StringBuilder sb2 =new StringBuilder("Techtorial");


        System.out.println(sb1.toString().equals(sb2.toString()));
        System.out.println(sb1.equals(sb2));

    }
}
