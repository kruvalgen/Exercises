package com.kruvalgen.FillInList;

import java.util.*;

//Заполнить ArrayList, LinkedList, SortedSet, HashMap 10000 элементов и посчитать за какое время это произойдет на вашей машине (тип любой)

public class Main {
    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();
        Map<String, Integer> hashMap = new HashMap<>();

        System.out.println(getTimeMsOfInsert(arrayList));
        System.out.println(getTimeMsOfInsert(linkedList));
        System.out.println(getTimeMsOfInsert(hashSet));
        System.out.println(getTimeMsOfInsert(treeSet));
        System.out.println(getTimeMsOfInsertInMap(hashMap));
        System.out.println(hashMap.size());

    }
    public static long  getTimeMsOfInsert(Collection<Integer> collection)
    {
        Date timeBefore = new Date();
        insert10000(collection);

        Date timeAfter = new Date();
        long msDelay = timeAfter.getTime() - timeBefore.getTime();
        return msDelay;
    }
    public static long  getTimeMsOfInsertInMap( Map<String, Integer> hashMap)
    {
        Date timeBefore = new Date();
        insert10000ForHashMap(hashMap);

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
    public static void insert10000ForHashMap(Map<String, Integer> hashMap){

        for (int i = 0; i < 10000 ; i++) {
            hashMap.put(" " + i, i);
        }
    }

}
