package com.atjl.util.queue.impl;

import com.atjl.util.queue.IQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Blocking queue use ArrayBlocking queue
 * Created by async on 2016/8/28.
 */
public class BlockingQueueEncap<T> implements IQueue<T> {
	/**
	 * block queue
	 */
	private BlockingQueue<T> linkq;

	/**
	 * default max size 65535
	 */
	private int maxSize = 65535;

	/**
	 * construct method
	 */
	public BlockingQueueEncap(){
		linkq = new ArrayBlockingQueue<>(maxSize);
	}

	/**
	 * construct method
	 * @param imaxSize maxSize
	 */
	public BlockingQueueEncap(int imaxSize){
		maxSize = imaxSize;
		linkq = new ArrayBlockingQueue<>(maxSize);
	}

	/**
	 * send one msg
	 *
	 * @param message send msg object
	 * @throws InterruptedException interrupt exception
	 */
	public void sendMessage(T message) throws InterruptedException {
		if (message != null) {
			linkq.put(message);
		}
	}


	public void sendMessage(T message,long mstime) throws InterruptedException {
		if (message != null) {
			linkq.offer(message,mstime,TimeUnit.MILLISECONDS);
		}
	}

	/**
	 * receive msg
	 *
	 * @return
	 * @throws InterruptedException interrupt exception
	 * @return Object recv msg object
	 */
	@Override
	public T receiveMessage() throws InterruptedException {
		return linkq.take();
	}

	@Override
	public T receiveMessage(long mstime) throws InterruptedException{
		return linkq.poll(mstime, TimeUnit.MILLISECONDS);
	}


	/**
	 * get now size
	 *
	 * @return queue size
	 */
	public int getCount(){
		return linkq.size();
	}

	/**
	 * chk producer buffer
	 * @return is queue full
	 */
	public boolean ifMaxCount(){
		return (maxSize - getCount())<10;
	}

}

