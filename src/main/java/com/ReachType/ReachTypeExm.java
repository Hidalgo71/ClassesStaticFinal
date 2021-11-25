package com.ReachType;

public class ReachTypeExm
{
    public static void main(String[] args)
    {
        System.out.println("Country: " + StaticFinalConst.country);
        StaticFinalConst per2 = new StaticFinalConst();
        per2.nameSur = "Yekta";
        StaticFinalConst.testMethod();

        int sum = Math.max(2,3);
        //System.out.println("pi: " + StaticFinalConst.piNum);
        System.out.println("pi: " + StaticFinalConst.PI_NUM);
        System.out.println("Comp Name: " + StaticFinalConst.COMPANY_NAME);
    }
}
