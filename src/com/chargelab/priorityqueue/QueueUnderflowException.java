package com.chargelab.priorityqueue;

public class QueueUnderflowException extends RuntimeException {
  public QueueUnderflowException(){
      super("Queue underflow");
  }
  public QueueUnderflowException(String message)
  {
      super(message);
  }
}