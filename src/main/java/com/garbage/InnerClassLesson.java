package com.garbage;

import com.ReachType.ReachTypeExm;
import com.ReachType.StaticFinalConst;

public class InnerClassLesson
{
    public String sclName;
    public int stuNum;
    private String religion;
    protected int coinNum;

    public class City
    {
        public int licence;
        public String cityName;
    }

    public void InClass()
    {
        int innCl;
    }
    //ReachTypeExm
    public static void main(String[] args)
    {
        InnerClassLesson per1 = new InnerClassLesson();
        per1.stuNum = 12;
        per1.religion = "muslim";
        per1.coinNum = 71;
    }
}
