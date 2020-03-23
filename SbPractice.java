package day23;

import javax.xml.transform.sax.SAXSource;

public class SbPractice {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Dear Student, ");
        sb.append("Please finish your homework.");

       String greetings="Welcome ";

       greetings =  greetings.concat("Back");

        System.out.println(greetings);
    }
}
