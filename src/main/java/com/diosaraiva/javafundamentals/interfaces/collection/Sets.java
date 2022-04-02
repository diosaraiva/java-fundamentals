package com.diosaraiva.javafundamentals.interfaces.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {    
    Set setA = new HashSet();
    Set setB = new LinkedHashSet();
    Set setC = new TreeSet();
    Set<String> setD = new HashSet<String>();

    SortedSet sortedSet = new TreeSet();

    NavigableSet navigableSet = new TreeSet();
}