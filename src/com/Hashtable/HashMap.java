package com.Hashtable;

public class HashMap<K, V> {
	
	private MyLinkedList<K> myLinkedList;
	
	public HashMap() {
		myLinkedList = new MyLinkedList<>();
	}

	public void put(K key, V value) {
		MyMapNode<K, V> myNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if(myNode == null) {
			myNode = new MyMapNode<>(key, value);
			this.myLinkedList.append(myNode);
		}else {
			myNode.setValue(value);
		}
		
	}
	

	@Override
	public String toString() {
		return "HashMap [myLinkedList=" + myLinkedList + "]";
	}

	public void remove(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}

