package DataBases.Queue.impl;

import DataBases.Queue.Queue;

public class ArrayQueue<E> implements Queue<E> {
    private int head;
    private int tail;
    private Object[] elementdata;

    public ArrayQueue(int maxSize) {
        elementdata = new Object[maxSize];
    }

    @Override
    public void inQueue(E e) {
        if(tail == elementdata.length) {
            System.err.println("Queue aleady fulled!");
        }else {
            elementdata[tail++] = e;
        }
    }

    @Override
    public E outQueue() {
        if(isEmpty()) {
            System.err.println("ArrayQueue is empty...");
            return null;
        }
        return (E) elementdata[head++];
    }

    @Override
    public E peek() {
        if(isEmpty()) {
            System.err.println("ArrayQueue is empty...");
            return null;
        }
        return (E) elementdata[head];
    }

    @Override
    public int getSize() {
        return tail-head;
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }
}
