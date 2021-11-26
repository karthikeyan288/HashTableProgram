package com.Hashtable;

public class MyMapNode<K, V> implements INode<K> {

	private K key;
	private V value;
	private INode<K> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setkey(K key) {
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		return this.next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("MyMapNode{key=").append(this.key).append(" value =").append(this.value).append("}");
		if (next != null) {
			buffer.append("->").append(next);
		}
		return buffer.toString();
	}
}
