package com.kruvalgen.FillInList;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();
        System.out.println(getTimeMsOfInsert(arrayList));
        System.out.println(getTimeMsOfInsert(linkedList));
        System.out.println(getTimeMsOfInsert(hashSet));
        System.out.println(getTimeMsOfInsert(treeSet));
    }
    public static long  getTimeMsOfInsert(Collection<Integer> collection)
    {
        Date timeBefore = new Date();
        insert10000(collection);

        Date timeAfter = new Date();
        long msDelay = timeAfter.getTime() - timeBefore.getTime();
        return msDelay;
    }
    public static void insert10000(Collection<Integer> collection)
    {
        for (int i=0;i<100000;i++)
        {
            collection.add(i);
        }
    }
}
