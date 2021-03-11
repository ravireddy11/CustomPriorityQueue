package com.chargelab.priorityqueue;

import java.util.ArrayList;

public class CustomPriorityQueue<T> {

	int queueSize = 0;

	private ArrayList<T> dataQueueArray;
	private ArrayList<Integer> priorityArray;
	int prevPriority = -1;
	int prevToPrevPriority = -2;

	// Constructor
	public CustomPriorityQueue(int queueSize) {
		this.queueSize = queueSize;
		dataQueueArray = new ArrayList<>(queueSize);
		priorityArray = new ArrayList<>(queueSize);
	}

	// Adds the items in the queue list by using priority
	public synchronized void add(T item, int priority) throws InvalidPriorityException, QueueOverflowException {
		if(size() > queueSize) {
			throw new QueueOverflowException();
		}
		if (priority <= 0) {
			throw new InvalidPriorityException("Priority shoule be a positive integer");
		}
		dataQueueArray.add(item);
		priorityArray.add(priority);
	}

	public boolean isEmpty() {
		return dataQueueArray.isEmpty();
	}
	
	private int size() {
		return dataQueueArray.size();
	}
	public synchronized T poll() {
		if (isEmpty()) {
			throw new QueueUnderflowException();
		}
		
		int max = 0;
		int maxPriority = priorityArray.get(0);
		for (int i = 0; i < dataQueueArray.size(); i++) {
			if (prevPriority == prevToPrevPriority && priorityArray.get(i) == prevPriority) {
				continue;
			}
			if (priorityArray.get(i) < maxPriority) {
				max = i;
				maxPriority = priorityArray.get(i);
			}
		}

		prevToPrevPriority = prevPriority;
		prevPriority = maxPriority;

		priorityArray.remove(max);
		return dataQueueArray.remove(max);
	}

}
