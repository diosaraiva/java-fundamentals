package com.diosaraiva.javafundamentals;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

public class Collections {    
    List listA = new ArrayList();
    List listB = new LinkedList();
    List listC = new Vector();
    List listD = new Stack();
    List<String> listE = new ArrayList<String>();

    Set setA = new HashSet();
    Set setB = new LinkedHashSet();
    Set setC = new TreeSet();
    Set<String> setD = new HashSet<String>();

    SortedSet sortedSet = new TreeSet();

    NavigableSet navigableSet = new TreeSet();

    Queue queueA = new LinkedList();
    Queue queueB = new PriorityQueue();
    Queue<String> queueC = new LinkedList<String>();

    Deque dequeA = new LinkedList();
    Deque dequeB = new ArrayDeque();
    Deque<String> dequC = new LinkedList<String>();

    Map mapA = new HashMap();
    Map mapB = new Hashtable();
    Map mapC = new LinkedHashMap();
    Map mapD = new Properties();
    Map mapE = new TreeMap();
    Map mapF = new WeakHashMap();
    Map<String, String> mapG = new HashMap<String, String>();
}