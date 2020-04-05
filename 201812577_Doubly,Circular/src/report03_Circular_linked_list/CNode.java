package report03_Circular_linked_list;

public class CNode <E> {
	private E item;
	private CNode next;
	public CNode (E newItem, CNode p) {
		item = newItem;
		next = p;
	}
	public E getItem() {return item;}
	public CNode getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(CNode newNext) {next = newNext;}
}