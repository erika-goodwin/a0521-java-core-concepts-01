package org.shop;

import org.shop.Door.Lock;

public class Door {
	private Lock lock;
	
	public Door() {
		lock = new Lock(true);
	}
	
	public Lock getLock() {
		return lock;
	}
	
	public void shopStatus() {
		System.out.println(lock.isLock());
	}
	
	public class Lock{
		private boolean lock;
		
		public Lock(boolean lock) {
			this.lock = lock;
		}
		
		public boolean isLock() {
			return lock;
		}
		
		public void setLock(boolean lock) {
			this.lock = lock;
		}
	}
	
	
}
