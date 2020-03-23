package day23;

public class StringPractice {

    public static void main(String[] args) {
        String str="tech";
        String str2=str;
        System.out.println(str2==str);
        str="tutorial";

        String str3="Welcome";
        str3=str3+" back";
        str3=str3+" home!";
        System.out.println(str3);


        StringBuilder sb=new StringBuilder("hi");
        StringBuilder sb2=new StringBuilder("hi");
        StringBuilder sb3=sb2;
        System.out.println(sb2.equals(sb3));
        sb2.append(" bye");
        System.out.println(sb2.hashCode());
        System.out.println(sb3);
        System.out.println(sb3.compareTo(sb3));



    }
}
