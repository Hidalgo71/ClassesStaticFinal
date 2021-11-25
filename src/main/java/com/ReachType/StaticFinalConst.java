package com.ReachType;

public class StaticFinalConst
{
    public String nameSur;
    private int age;
    public static String country = "TR";
    public static void testMethod()
    {
        System.out.println("testMethod called.");
    }
    public final String planet = "Earth";
    public void finalMethod()
    {
        int  maxLessonNum = 100;
        int passNum = 50;
        int stuNum = 40;

        if (stuNum < passNum)
        {
            System.out.println("Failed");
        }
        if (stuNum > passNum)
        {
            stuNum = maxLessonNum;
        }
    }

    //CONSTANT
    //Final ile static'İn birleşmiş hali.
    //public static final double piNum = 3.1415;
    public static final double PI_NUM = 3.1415;
    public static final String COMPANY_NAME = "Testinium";
}
