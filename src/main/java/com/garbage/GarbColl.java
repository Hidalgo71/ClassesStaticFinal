package com.garbage;

public class GarbColl
{
    public static void main(String[] args)
    {
        //Assuming created student method
        //And createc 1.000.000 student object

        /*for (int i = 0; i < 123123123; i++)
        {
            Student stu1 = new Student();
        } */

        System.gc(); // make Gar. Col. active


    }
}
