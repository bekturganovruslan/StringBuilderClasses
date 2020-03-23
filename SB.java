package day23;

public class SB {
    public static void main(String[] args) {

        StringBuilder StBa1=new StringBuilder("StringBuilder");
        StringBuilder StBa2=new StringBuilder("StringBuilder");
        System.out.println(StBa1==StBa2); // check  objects ------------------> false
        System.out.println(StBa1.equals(StBa2));// checks values and objects ---->false
        StBa1=StBa2;                    // reassigned, both pointing one object now
        System.out.println(StBa1.equals(StBa2));  //value are same, objects are same ->true

        String str1=new String("String");
        String str2=new String("String");
        System.out.println(str1==str2); // check  objects------------------->  false
        System.out.println(str1.equals(str2));// check values ----------------> true
    }
}
