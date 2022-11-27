package oop_principles.inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class TesterClub {
    public static void main(String[] args) {
       FrontendTester ft1 = new FrontendTester("Othman",23, "1993", "000",true);
       BackendTester bt1 = new BackendTester("John",45, "1982", "111",false);
       FrontendTester ft2 = new FrontendTester("Alex",29, "1980", "222",false);
       BackendTester bt2 = new BackendTester("Jane",36, "2000", "333",false);

        Tester[] testers = {ft1,ft2,bt1,bt2};
        int manualT =0, autoT = 0, average = 0;
        for (Tester t : testers) {
            if(t.isAutomationTester) autoT++;
            else manualT++; average += t.age;
        }
        System.out.println(manualT);
        System.out.println(autoT);
        System.out.println(average / testers.length);
    }
}
