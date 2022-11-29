package demo;

import java.util.Locale;

public class lec14 {
    public static void main(String[] args) {

        String name=new String("Altamash");
//        int value = name.length();
//        System.out.println(value);
//        System.out.println(name.toLowerCase(Locale.ROOT));
//        System.out.println(name.toUpperCase(Locale.ROOT));

//        String nonTrimedString ="                 Altamash            ";
//        System.out.println(nonTrimedString.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace('a','b'));
//        System.out.println(name.replace('m','er'));
//        name=name.replace('m','er');

    }
}
