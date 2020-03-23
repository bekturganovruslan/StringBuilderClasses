package day23;

public class SbCapacity {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder(5);
        sb.append("tech");

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("torial");
        System.out.println(sb.capacity());


    }
}