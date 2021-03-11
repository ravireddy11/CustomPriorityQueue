package com.chargelab.priorityqueue;

public class QueueOverflowException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public QueueOverflowException() {
		super("Queue overflow");
	}

	public QueueOverflowException(String message) {
		super(message);
	}
}
