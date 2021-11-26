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
	
	public void remove(K key) {
		int indexNumber = this.getBucketNumber(key);
		MyLinkedList<K> linkedList = arrayList.get(indexNumber);
		if (linkedList == null) {
			return;
		}
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.deleteNode(key);
	}
	

	public V get(K key) {
		MyMapNode<K, V> myNode = (MyMapNode<K, V>) this.myLinkedList.search(key); 
		return (myNode == null)?null: myNode.getValue();
	}
	
	@Override
	public String toString() {
		return "HashMap [myLinkedList=" + myLinkedList + "]";
	}	

}

