package com.kruvalgen.FillInList;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
//        System.out.println(getTimeMsOfInsert(new HashMap<>()));
    }
    public static long  getTimeMsOfInsert(List list)
    {
        Date timeBefore = new Date();
        insert10000(list);

        Date timeAfter = new Date();
        long msDelay = timeAfter.getTime() - timeBefore.getTime();
        return msDelay;
    }
    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
}
