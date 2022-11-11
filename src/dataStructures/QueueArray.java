package dataStructures;

import java.util.NoSuchElementException;
import java.lang.StackOverflowError;

public class QueueArray {
	private int queueArray[];
    private int front;
    private int rear;
    private int maxSize;
    private static final int DEFAULT = 10;
	
    public QueueArray(){
        this(DEFAULT);
    }

    public QueueArray(int size){
        maxSize = size;
    	queueArray = new int[maxSize];
    	front = -1;
    	rear = -1;
    }

    public void insert(int x){
    	if(isFull()){
    		System.out.println("Queue Overflow");
            throw new StackOverflowError();
    	}
    	if(front == -1)
    		front = 0;
    	rear++;
    	queueArray[rear] = x;
    }

    public int remove(){
    	if(isEmpty()){
    		System.out.println("Queue Underflow");
    		throw new NoSuchElementException();
    	}
    	int x = queueArray[front];
    	front++;
    	return x;
    }

    public int peekFront(){
    	if(isEmpty()){
    		System.out.println("Queue Underflow");
    		throw new NoSuchElementException();
    	}
    	return queueArray[front];
    }

    public int peekRear(){
    	if(isEmpty()){
    		System.out.println("Queue Underflow");
    		throw new NoSuchElementException();
    	}
    	return queueArray[rear];
    }

    public int size(){
    	if(isEmpty())
    		return 0;
    	else
    		return rear - front + 1;
    }

    public boolean isEmpty(){
    	return (front == -1 || front == rear +1);
    }

    public boolean isFull(){
    	return (rear == queueArray.length - 1 );
    }

    public void display(){
    	if(isEmpty()){
    		System.out.println("Queue is empty");
    		return;
    	}
    	for(int i = front; i <= rear; i++)
    		System.out.print(queueArray[i] + " ");
    	System.out.println();
    }

    public static void main(String[] args) {
        QueueArray queueArr = new QueueArray(5);
        queueArr.insert(3);
        queueArr.insert(4);
        queueArr.insert(5);
        queueArr.insert(8);
        queueArr.insert(1);

        queueArr.display();
        System.out.println(queueArr.isFull());
        System.out.println( queueArr.peekFront());
        queueArr.remove();
        System.out.println(queueArr.isEmpty());
    }
}