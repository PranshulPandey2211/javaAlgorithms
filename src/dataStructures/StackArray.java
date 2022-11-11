package dataStructures;

import java.util.EmptyStackException;
import java.lang.StackOverflowError;

public class StackArray {
    private int stackArray[];
    private int top;
	private int maxSize;
	private static final int DEFAULT = 10;

	public StackArray(){
		this(DEFAULT);
	}
    
    public StackArray(int size){
		maxSize = size;
    	stackArray = new int[maxSize];
    	top = -1;
    }

    public void push(int x){
    	if(isFull()){
    		System.out.println("Stack Overflow");
    		throw new StackOverflowError();
    	}
    	top++;
    	stackArray[top] = x;
    }

    public int pop(){
    	int x;
    	if(isEmpty()){
    		System.out.println("Stack Underflow");
    		throw new EmptyStackException();
    	}
    	x = stackArray[top];
    	top--;
    	return x;
    }

    public int peek(){
    	if(isEmpty()){
    		System.out.println("Stack Underflow");
    		throw new EmptyStackException();
    	}
    	return stackArray[top];
    }
    
    public int size(){
    	return top + 1;
    }

    public boolean isEmpty(){
    	return (top == -1);
    }

    public boolean isFull(){
    	return (top == stackArray.length-1);
    }

    public void display(){
    	if(isEmpty()){
    		System.out.println("Stack is empty");
    		return;
    	}
        System.out.println("Stack is: ");
    	for(int i = top; i >= 0; i--)
    		System.out.print(stackArray[i] + " ");
    	System.out.println();
    }

    public static void main(String[] args){
		StackArray stackArr = new StackArray(5);
		stackArr.push(5);
		stackArr.push(2);
		stackArr.push(9);
		stackArr.push(4);
		stackArr.push(1);

		stackArr.display();
		System.out.println(stackArr.isFull());
		System.out.println(stackArr.pop());
		System.out.println(stackArr.peek());
		System.out.println(stackArr.isEmpty());
	}
}