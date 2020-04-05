package report03_Circular_linked_list;

public class Node <E> {
	private E item;
	private Node next;
	public Node(E newItem, Node<E> p) {
		item = newItem;
		next = p;
	}
	
	public E getItem() {return item;}
	public Node getNext() {return next;}
	public void setItem(E newItem) {item= newItem;}
	public void setNext(Node<E> newNext) {next = newNext;}

}