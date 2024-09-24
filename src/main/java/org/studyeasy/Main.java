package org.studyeasy;

public class Main {
    public static void main(String[] args) {

        Phone phone = new SamsungPhone();
        String p = phone.processor();
        System.out.println(p);
        System.out.println(phone.spaceInGb());


    }
}
