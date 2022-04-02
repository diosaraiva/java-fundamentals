package com.diosaraiva.javafundamentals.interfaces.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {    
	Queue queueA = new LinkedList();
	Queue queueB = new PriorityQueue();
	Queue<String> queueC = new LinkedList<String>();

	Deque dequeA = new LinkedList();
	Deque dequeB = new ArrayDeque();
	Deque<String> dequC = new LinkedList<String>();
}