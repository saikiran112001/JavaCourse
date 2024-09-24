package org.studyeasy;

public class SamsungPhone implements Phone {
    public String processor(){
        return "D1000";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }
}
